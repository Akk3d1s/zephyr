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
service for the nodes. Discovery can be managed may be with Zookeeper.
On the registration process the requesting node will share own public key with the connected node. All nodes will share the
known nodes with each other.

#### Coin
The Zephyr coin is self the block, simple object with set of transactions inside. Each transaction descibes how many parts
of the current coin are transfered from and to which wallet address. The coins self should be create with Proof of Work based on
mathematic research. May be a calculation of a prime number. The coins should be generated and signed by 13 private keys
with a limit amount before the network will goes live. The keys should be destroyed after the generation process.
Alternative solution could be kind of Proof of Authenticity.
The coin size should be not limited. Every transaction will be stored inside of the coin. That is a problem in a global
blockchain, because every member needs to download maybe a very big block. In case of Sephyr only the members of
the coin transactions and may be a "master" server need to store the whole block / coin.

The target of the system is not the coin. It is the whole environment with the application layer.