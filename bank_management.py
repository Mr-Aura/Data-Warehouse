from tabulate import tabulate
import mysql.connector as c
con = c.connect(host="localhost",username="root",passwd="gtatcrew786")
cursor = con.cursor() 
cursor.execute("CREATE DATABASE IF NOT EXISTS BANKING")
cursor.execute("USE BANKING")
cursor.execute('''CREATE TABLE IF NOT EXISTS ACCOUNT(accno INT PRIMARY KEY,name VARCHAR(30)
NOT NULL,username VARCHAR(10) NOT NULL,acctype VARCHAR(10) NOT NULL,balance INT,age INT
,kyc VARCHAR(20))''')
while True:
    print("======================================================")
    print("Press 1 for Opening a New Bank Account")
    print("Press 2 for Displaying all Account Details")
    print("Press 3 for Displaying all Accounts")
    print("Press 4 for Deleting all Accounts")
    print("Press 5 to Delete an Account")
    print("Press 6 to Modify an Account")
    print("Press 7 to Deposit money")
    print("Press 8 to Withdraw money")
    print("Press 9 for updating or adding KYC Details")
    print("Press 0 to Exit")
    print("======================================================")
    choice = int(input("Enter your choice:"))
    print("======================================================")
    if choice == 1:
        try:
            print("Kindly Fill the Following Details:")
            accno = int(input("Enter Account No:"))
            name = input("Enter Name:")
            username= input("Enter User Name:")
            acctype = input("Enter Account Type:")
            balance = int(input("Enter Opening Balance:"))
            age = int(input("Enter Age:"))
            kyc = "NOT DONE!"
            print("======================================================")
            value = (accno,name,username,acctype,balance,age,kyc)
            query = "INSERT INTO ACCOUNT_REGISTRY VALUES (%s,%s,%s,%s,%s,%s)"
            cursor.execute(query,value)
            con.commit()
            print("Account Created Successfully!")
        except:
            print("Error in Creating Account!")
    elif choice == 2:
        try:
            query = "SELECT * FROM ACCOUNT"
            cursor.execute(query)
            detail = cursor.fetchall()
            print(tabulate(detail,tablefmt="psql"))
        except:
            print("Error in displaying details!")
    elif choice == 3:
        try:
            no = input("Enter Account Number to Display:")
            query = "SELECT * FROM ACCOUNT WHERE ACCNO = "+no
            cursor.execute(query)
            myrecord = cursor.fetchone()
            c = cursor.rowcount
            if c==0:
                print("Account Number Not Found...")
            else:
                print("Record of Account Number:"+no)
                print("myrecord")
        except:
            print("Error in Displaying Details!")
    elif choice == 4:
        try:
            ch = input("Do You Want to Delete All Records (Y/N):")
            if ch=='y' or ch=='Y':
                query = "truncate table ACCOUNT"
                cursor.execute(query)
                con.commit()
                print("All Records Deleted")
        except:
            print("Error in Deleting Records!")
    elif choice == 5:
        try:
            no = input("Enter Account Number To Delete:")
            query = "DELETE FROM ACCOUNT WHERE accno = "+no
            cursor.execute(query)
            con.commit()
            c = cursor.rowcount
            if c>0:
                print("Account Deleted.")
            else:
                print("Invalid Account Number")
        except:
            print("Error in Deleting Record!")
    elif choice == 6:
        try:
            no = input("Enter Account Number To Modify:")
            query = "SELECT * FROM ACCOUNT WHERE accno = "+accno
            cursor.execute(query)
            myrecord = cursor.fetchone()
            c = cursor.rowcount
            if c==0:
                print(f"Account Number {no} does not exist")
            else:
                name = myrecord[1]
                username = myrecord[2]
                typ = myrecord[3]
                bal = myrecord[4]
                ag = myrecord[5]
                print(f"Account Number : {myrecord[0]}")
                print(f"Name : {myrecord[1]}")
                print(f"UserName : {myrecord[2]}")
                print(f"AccType : {myrecord[3]}")
                print(f"Balance : {myrecord[4]}")
                print(f"Age : {myrecord[5]}")
                print("======================================================")
                print("ENTER THE NEW VALUE FOR CHANGE OR JUST LEAVE AND PRESS ENTER")   
                aa = input("Enter New Name OR Leave:")
                if len(aa)>0:
                    name = aa
                bb = input("Enter New UserName OR Leave:")
                if len(bb)>0:
                    username = bb
                cc = input("Enter New Account Type OR Leave:")
                if len(cc)>0:
                    typ = cc
                dd = input("Enter New Age OR Leave:")
                if len(dd)>0:
                    ag = dd
                query = f"UPDATE ACCOUNT SET name = {name},username = {username},
                acctype = {typ},age={str(ag)} WHERE accno = {no};"
                cursor.execute(query)
                con.commit()
                print("Details Modified")
        except Exception as e:
            print("Error in Modifying!")
            print(e)
    elif choice == 7:
        try:
            no = input("Enter Account Number:")
            query = f"SELECT * FROM ACCOUNT WHERE accno = {no}"
            cursor.execute(query)
            myrecord = cursor.fetchone()
            c = cursor.rowcount()
            if c==0:
                print(f"Account Number {no} does not exist!")
            else:
                amount = int(input("Enter Amount to Deposit:"))
                bal = amount+int(myrecord[4])
                query = "UPDATE ACCOUNT SET balance = %s WHERE accno = %s"
                rec = (bal,no)
                cursor.execute(query,rec)
                con.commit()
                print(f"Amount Deposited in Account Number {no}")
                print(f"Updated Balance is : {bal}")
        except:
            print("Error in Depositing Amount!")
    elif choice == 8:
        try:
            no = input("Enter Account Number:")
            query = f"SELECT * FROM ACCOUNT WHERE ACCNO = {no}"
            cursor.execute(query)
            myrecord = cursor.fetchone()
            c = cursor.rowcount
            if c==0:
                print(f"Account Number {no} Does Not Exist!")
            else:
                amount = int(input("Enter Amount to Withdraw:"))
                if amount < int(myrecord[4]):
                    bal = int(myrecord[4])-amount
                    if bal>1000:
                        query = "UPDATE ACCOUNT SET balance = %s WHERE accno = %s"
                        rec = (bal,no)
                        cursor.execute(query,rec)
                        con.commit()
                        print("Amount Withdrawal Successful!")
                        print(f"Account Balance After Withdrawal : {bal}")
                    else:
                        print("Minimum Balance Criteria Violated!")
                else:
                    print("Insufficient Balance...")
        except:
            print("Error in Withdrawing Amount")
    elif choice == 9:
        no = input("Enter Your Account Number:")
        query = f"SELECT * FROM ACCOUNT WHERE accno = {no}"
        cursor.execute(query)
        myrecord = cursor.fetchone()
        c = cursor.rowcount
        if c == 0:
            print(f"Account Number {no} Does Not Exist!")
        else:
            if myrecord[6]=="NOT DONE!":
                print("For KYC you need to provide details from one of these goverment id")
                print("Press 1 for Aadhar Card")
                print("Press 2 for Voter ID Card")
                print("Press 3 for Pan Card")
                print("Press 4 for Driving License")
                print("======================================================")
                cho = int(input("Enter your choice:"))
                if cho==1:
                    ad = input("Enter Aadhar Number:")
                    query = "UPDATE ACCOUNT SET kyc = %s WHERE accno = %s"
                    rec = (ad,no)
                    cursor.execute(query,rec)
                    con.commit()
                    print("KYC Done!")
                elif cho == 2:
                    vi = input("Enter Valid ID Number:")
                    query = "UPDATE ACCOUNT SET kyc = %s WHERE accno = %s"
                    rec = (vi,no)
                    cursor.execute(query,rec)
                    con.commit()
                    print("KYC Done!")
                elif cho == 3:
                    pc = input("Enter Valid ID Number:")
                    query = "UPDATE ACCOUNT SET kyc = %s WHERE accno = %s"
                    rec = (pc,no)
                    cursor.execute(query,rec)
                    con.commit()
                    print("KYC Done!")
                elif cho == 4:
                    dl = input("Enter Valid ID Number:")
                    query = "UPDATE ACCOUNT SET kyc = %s WHERE accno = %s"
                    rec = (dl,no)
                    cursor.execute(query,rec)
                    con.commit()
                    print("KYC Done!")
                else:
                    print("Wrong Choice!")
            else:
                print("KYC Already Done!")
    elif choice==0:
        break
    else:
        print("Invalid Choice")