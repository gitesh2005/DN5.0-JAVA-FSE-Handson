SET SERVEROUTPUT ON;

BEGIN
    FOR customer_rec IN (
        SELECT CustomerID, Name, Balance
        FROM Customers
    )
    LOOP
        IF customer_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = customer_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                customer_rec.Name || ' promoted to VIP status.'
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/