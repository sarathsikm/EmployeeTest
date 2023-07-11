
CREATE TABLE employee (
    empid 						integer NOT NULL PRIMARY KEY,
    name				        varchar(255),
    phone 					    varchar(12),
    dateOfBirth				    varchar(255),
    employeeAddress	            date(255)
);

CREATE TABLE address (
    addressid 				integer NOT NULL PRIMARY KEY,
    empid 			        integer NOT NULL REFERENCES employee(empid),
    houseName 		        varchar(255),
    place 			        varchar(255),
    pincode                 varchar(255),
    CONSTRAINT fk_employee FOREIGN KEY (empid) REFERENCES empid(empid)
);