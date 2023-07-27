 QAP_2_SDAT

API has 4 entities including Aircraft, Airport, Passengers, and City. You can do CRUD operations with the API(GET, PUT, POST, PATCH, DELETE). The API also has relationships defined below.

POSTMAN RELATIONSHIPS

Cities Can Have Many Airports

![Screen Shot 2023-07-27 at 12 39 40 PM](https://github.com/CamDamico/QAP_2_SDAT/assets/107636507/a5b4dcd9-8c38-4d0b-acde-e163ffff397d)

Passengers Can Fly on Many Aircraft

![Screen Shot 2023-07-27 at 12 36 09 PM](https://github.com/CamDamico/QAP_2_SDAT/assets/107636507/b15def23-9b13-4e79-8ece-270eed423290)

Airports That Aircraft Can Land At

![Screen Shot 2023-07-27 at 12 32 41 PM](https://github.com/CamDamico/QAP_2_SDAT/assets/107636507/119b524c-27a6-4c3f-a5bb-098e3fd7eec5)

Passengers Can Only Live In One City

![Screen Shot 2023-07-27 at 1 59 30 PM](https://github.com/CamDamico/QAP_2_SDAT/assets/107636507/9e296272-1716-45a9-9f7f-e30bcd80c9a6)

Proof Of Docker Running

![Screen Shot 2023-07-27 at 2 11 39 PM](https://github.com/CamDamico/QAP_2_SDAT/assets/107636507/5416c350-a311-4e97-b92f-96549b717c8b)

![Screen Shot 2023-07-27 at 2 30 09 PM](https://github.com/CamDamico/QAP_2_SDAT/assets/107636507/0b313353-032c-490c-bfa7-65b3986e9c08)

<img width="1356" alt="Screen Shot 2023-07-27 at 2 46 48 PM" src="https://github.com/CamDamico/QAP_2_SDAT/assets/107636507/8d7a5362-160b-49fd-8090-67d64d25211c">


I could not get relationships Airports can only have one city,and Aircraft can have many passengers. Postman was not picking up the endpoints i had created for these 2 relationships and MySQL would not allow me to manually add in these relationships as MySQL would not allow my to make a query without the application crashing. 
