SET SERVEROUTPUT ON;

DECLARE
    v_age NUMBER;
BEGIN
    FOR customer_rec IN (
        SELECT CustomerID, Name, DOB
        FROM Customers
    )
    LOOP
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, customer_rec.DOB) / 12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                '1% discount applied for customer: ' || customer_rec.Name ||
                ', Age: ' || v_age
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/