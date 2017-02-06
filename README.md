# FinCo


A partial fulfillment of Advanced Software Development course.

It is a simple framewor design. We used Account pattern, Party pattern and little bit tweaked Observer pattern with Change Manager based on Domain object driven design. Party pattern is used for customer section related with the types of account whereas Account pattern is for types of account and their hierarchy. Observer pattern is implemented for the transaction like withdrawal and/or deposit which occurs in the system and we are using DI for injecting event handlers in Domain Event Manager.Various type of database connection are handled by the implementation of the Strategy Pattern. Customers are notified about the special events through emails
