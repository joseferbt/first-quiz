# OWASP Top 10 secure system 
## A01
in the A01 we found Broken access control,  in this topic the recommendations are: 
- Make sure that the authentication check for the right role, having this 3 customers with full access to the system is a weak point in the application .
- secure the URLs to administrator panel, making sure that a user has to be log in if it is in those URLs

## A02
in this case having password data in the data base this password must be encrypted so if by mistake this information is displayed there is no possibility to get an inside of this data 
 ## A03
 injections are a common practice for extracting information from  applications, fields or input data supplied by the costumer must be validated, filter by the application making sure that there is no a malicious intent.
 ## A04
 implements a robust model that solve weak points presented in the application design.
 ## A05
 having all functionalities working and in a done state do not post any functionalities in a test manner this can generate a break that attackers may take advantage
 for the 3 front error messages must be clear to the costumer, do not present the interpreter errors to costumers as they appear  .
 have all security settings updated.
 ## A06
 check for unused dependencies, unnecessary features that may be a week point, and remove them.
 ## A07
 have strategies for authentication related attacks.
 one of the most common is brute force so there no must be able to try to log in after 3 failed attempts in less than a minute.
 check for week passwords, filter this passwords by requesting to users a long multi character passwords.
 application sessions, make a session have a timeout so if for any reason a user left its session open on a computer and forgets to log out automatically.
 ## A10
 process all data sent to costumers, it cant be raw, but also validate all costumer input data.
 
