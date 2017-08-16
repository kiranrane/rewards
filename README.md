1.  public List<Reward> getRewardsByPerson(List<Voucher> vouchers, List<Credit> credits) 
  takes two Lists, a List of Voucher and a List of Credit and returns a List of Reward .
  
  Assumption is that the other two services i.e Credit and Voucher are already written and they will have endpoints which return List<Voucher> and List<Credit>, which are the input arguments required by getRewardsByPerson in Reward service.
  
  2. Since this application is an internal application, it can be provided on the company's SSO page for employees. SSO can be provided using SAML tokens. Architecture-Spring Boot, Microservices with RESTful webservices.
    There will be 3 kinds of roles for employees- Read only, Read-Write and Admin.
Say currently there are 3 categories of policies-IT Security, Travel & HR.
All employees will have Read only access to documents belonging to any of these categories.
Employees belonging to a particular team will have Write access to documents of that category only. Eg. Travel policy documents (multi document upload possible) can be uploaded by employees belonging to that department only. Document owner is different from uploader.
Any document to be uploaded should be in non-editable PDF format only with size less than 2MB.
Admin role employees can create new category of policies say Leave policy and also assign roles to all employees.


3. Yes i take interest in reading technical books,articles and blogs. In fact this is an integral part of any developer's life to keep oneself updated with the latest technologies. For Spring Boot and Java 8 features i have particulary liked blogs by Mkyong and Baeldung. They illustrate concepts with examples for easy understanding. Java 8 features for Collections like streams are particularly easy for reducing LOC and are widely illustrated in these two blogs.
  
