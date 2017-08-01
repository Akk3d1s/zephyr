# White Paper
Zephyr network and crypto currency with extra application layer. 

### Technical background
Zephyr applications should be implemented as common web applications, accessible from each node in the network trough 
the open port, which can also be opened with "NAT breakout" technology. That means, the node will be accessible from outside, 
through the open port in the firewall. An extra thin P2P communication layer is necessary, because of encrypted node to node 
communication. 
The web applications should have own unique id, because of routing, to avoid conflicts between the applications.
The id can be understood as virtual hostname of the Zephyr network application. 
The reason to use the common web application standards is, to have best way to adapt as much as possible developers,
to write or migrate own applications for the network. It is also much easier to write applications with common frameworks. 
Example application can be a simple web application based on Angular with Java REST Backend or we can have a Spark worker 
node for big data and machine learning use cases. Each application can offer a free services like a REST Call with returning
specific data or paid calculation / aggregation with spark on the node GPU / CPU. Another use case could be a 
decentralized and encrypted file storage like AWS S3, where the files are splitted in very small peaces and stored on
all this app supported nodes and accessible only with the right private key. 

#### Node registration
Each node needs to be registrated on other nodes. It should be a main node existing, to have a failover discovery 
service for the nodes. 
On the registration process the requesting node will share own public key with the connected node. All nodes will share the
known nodes with each other.