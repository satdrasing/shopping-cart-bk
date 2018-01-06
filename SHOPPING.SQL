use shoppingdb

INSERT INTO USER (USER_NAME, USER_PASSWORD, USER_E_MAIL, USER_DOB,USER_ROLE) VALUES("SATENDRA","ABC","SATENDRA.KOHLI@GMAIL.COM","17-JUL-1986","ADMIN");
SELECT * FROM USER;
DROP TABLE USER;
#====================================

INSERT INTO SHOPPING(SH_PRODUCT_NAME, SH_PRODUCT_ID, SH_COST, SH_CATEGORY,SH_IMAGE, SH_DESCRIPTION ) VALUES ("Canon EOS 800D 24.2MP Digital SLR Camera","001","55900","Electronics","null","Canon EOS 800D 24.2MP Digital SLR Camera + EF-S 18-55mm IS STM Lens "); 
INSERT INTO SHOPPING(SH_PRODUCT_NAME, SH_PRODUCT_ID, SH_COST, SH_CATEGORY,SH_IMAGE, SH_DESCRIPTION ) VALUES ("Sony 80.1 cm (32 inches) Bravia KLV-32W672E Full HD LED Smart TV (Black)","002","35990","Electronics","null","Sony 80.1 cm (32 inches) Bravia KLV-32W672E Full HD LED Smart TV (Black)"); 
INSERT INTO SHOPPING(SH_PRODUCT_NAME, SH_PRODUCT_ID, SH_COST, SH_CATEGORY,SH_IMAGE, SH_DESCRIPTION ) VALUES ("Seiko Lord Chronograph Blue Dial Men's Watch","003","29420","Watches","null","Seiko Lord Chronograph Blue Dial Men's Watch"); 
INSERT INTO SHOPPING(SH_PRODUCT_NAME, SH_PRODUCT_ID, SH_COST, SH_CATEGORY,SH_IMAGE, SH_DESCRIPTION ) VALUES ("HP 14q-BU006TU 2017 14-inch Laptop","004","30990","Computers","null","HP 14q-BU006TU 2017 14-inch Laptop"); 
INSERT INTO SHOPPING(SH_PRODUCT_NAME, SH_PRODUCT_ID, SH_COST, SH_CATEGORY,SH_IMAGE, SH_DESCRIPTION ) VALUES ("Xbox One 1TB Console","005","36100","Video Games","null","Xbox One 1TB Console"); 
INSERT INTO SHOPPING(SH_PRODUCT_NAME, SH_PRODUCT_ID, SH_COST, SH_CATEGORY,SH_IMAGE, SH_DESCRIPTION ) VALUES ("Bosch 6.5 kg Fully-Automatic Front Loading Washing Machine ","006","27490","Home & Kitchen","null","Bosch 6.5 kg Fully-Automatic Front Loading Washing Machine "); 
INSERT INTO SHOPPING(SH_PRODUCT_NAME, SH_PRODUCT_ID, SH_COST, SH_CATEGORY,SH_IMAGE, SH_DESCRIPTION ) VALUES ("Carrier 18K Estrella Premium Window AC (1.5 Ton)","007","30490","Home & Kitchen","null","Carrier 18K Estrella Premium Window AC (1.5 Ton, 5 Star Rating, White, Copper)");
INSERT INTO SHOPPING(SH_PRODUCT_NAME, SH_PRODUCT_ID, SH_COST, SH_CATEGORY,SH_IMAGE, SH_DESCRIPTION ) VALUES ("Apple iPhone X (Silver, 256GB) -  Limited edition","008","98880.","Electronics","null","Apple iPhone X (Silver, 256GB)"); 
INSERT INTO SHOPPING(SH_PRODUCT_NAME, SH_PRODUCT_ID, SH_COST, SH_CATEGORY,SH_IMAGE, SH_DESCRIPTION ) VALUES ("Sony BDV-N9200W 3D Blu-Ray Home Cinema System","009","54990","Electronics","null","Sony BDV-N9200W 3D Blu-Ray Home Cinema System"); 
INSERT INTO SHOPPING(SH_PRODUCT_NAME, SH_PRODUCT_ID, SH_COST, SH_CATEGORY,SH_IMAGE, SH_DESCRIPTION ) VALUES ("Bose Companion 50 Multimedia Speaker System","0010","32000","Electronics","null","Bose Companion 50 Multimedia Speaker System");


SELECT * FROM SHOPPING;

DROP TABLE SHOPPING;

#====================================

SELECT * FROM ORDERS

DROP TABLE ORDERS

#====================================
SELECT * FROM ADDRESS
DROP TABLE ADDRESS

select * from fullfillment