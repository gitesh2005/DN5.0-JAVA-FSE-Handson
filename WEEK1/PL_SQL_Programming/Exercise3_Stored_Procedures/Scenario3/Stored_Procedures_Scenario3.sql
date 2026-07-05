CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account_id IN NUMBER,
    p_to_account_id IN NUMBER,
    p_amount IN NUMBER
) AS
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account_id;

    IF v_balance >= p_amount THEN
        UPDATE Accounts
        SET Balance = Balance - p_amount,
            LastModified = SYSDATE
        WHERE AccountID = p_from_account_id;

        UPDATE Accounts
        SET Balance = Balance + p_amount,
            LastModified = SYSDATE
        WHERE AccountID = p_to_account_id;

        INSERT INTO Transactions (
            TransactionID,
            AccountID,
            TransactionDate,
            Amount,
            TransactionType
        )
        VALUES (
            TransactionSeq.NEXTVAL,
            p_from_account_id,
            SYSDATE,
            p_amount,
            'Withdrawal'
        );

        INSERT INTO Transactions (
            TransactionID,
            AccountID,
            TransactionDate,
            Amount,
            TransactionType
        )
        VALUES (
            TransactionSeq.NEXTVAL,
            p_to_account_id,
            SYSDATE,
            p_amount,
            'Deposit'
        );

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance. Transfer failed.');
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Invalid account ID.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/