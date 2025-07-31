# **Simplifying Kafka: The Railway of Messages** 🚂

---

🎥 **Watch the playlist on YouTube**: [youtube.com/@gabrielbragadev](https://youtube.com/@gabrielbragadev) 🔗

🐙 **Access the repository on GitHub**: [github.com/bragabriel](https://github.com/bragabriel/products-api-java) 🔗

---

## **Overview**
[Kafka](https://kafka.apache.org) is an extremely powerful distributed **messaging platform**. However, it can be challenging to understand how it works if you're not familiar with its key concepts. The **goal** of this project is to <u>simplify learning Kafka</u> by using a fun and easy-to-understand analogy with trains and railways 🚂 — making the concepts so clear that even a child could grasp them.

The series **[Simplifying Kafka](TODO)** (🎥 <u>available on YouTube</u>) explores, episode by episode, how each part of Kafka works, explaining concepts like **producers**, **consumers**, **brokers**, **partitions**, **offsets**, and much more — all in a simplified and accessible way. 😉

---

## 📺 **Episodes**
Each video is dedicated to a fundamental aspect of Kafka, using the railway analogy to make understanding easier. Here are the topics covered:

| **#** | **Episode**                                | **Description**                                                                                                            |
|-------|--------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|
| **1** | **Introduction**                           | *"Simplifying Kafka: Explaining Kafka as if You Were 5 Years Old!"* - Introducing the learning process in a simplified way.|
| **2** | **Topic → Track**                          | *"Simplifying Kafka: How Trains Find Their Path"* - How data (messages) follow tracks (topics).                           |
| **3** | **Producer → Farmer**                      | *"Simplifying Kafka: How Farmers Send Products (Messages) to the City"* - The role of the producer in message delivery.   |
| **4** | **Message → Products in the Wagon**        | *"Simplifying Kafka: How Messages Are Loaded into Wagons"* - How messages are organized and transported.                  |
| **5** | **Broker → Train Station**                 | *"Simplifying Kafka: The Role of the Train Station (Broker) in the Kafka World"* - How brokers facilitate message delivery.|
| **6** | **Partition → Specific Track**             | *"Simplifying Kafka: Avoiding Traffic Jams on the Tracks (Partitions)"* - Dividing messages into partitions to optimize performance. |
| **7** | **Hot Partition → Overloaded Wagon**       | *"Simplifying Kafka: What Happens When a Wagon Gets Too Full (Hot Partitions)"* - Impact of overloads on the system.      |
| **8** | **Consumer Group → Market Network**        | *"Simplifying Kafka: How to Distribute Product Loads Across Markets"* - Teamwork among consumers.                         |
| **9** | **Rebalance → Logistics Change**           | *"Simplifying Kafka: How to Re-Organize Wagons If One Breaks? (Rebalance)"* - Redistributing message loads.               |
| **10**| **Offset → Starting Point**                | *"Simplifying Kafka: How to Know Where to Start Picking Products (Offsets Explained)"* - Tracking messages.               |
| **11**| **Producer Acknowledgment → Confirmation** | *"Simplifying Kafka: How the Farmer Knows Their Products Reached the Destination"* - Delivery guarantees.                 |

---

## 💻 **Technologies Used**
- **Java**: Main language for implementing the Kafka example.
- **Spring Boot**: Framework to simplify development.
- **Apache Kafka**: Distributed messaging platform.
- **Docker**: To streamline local execution with Kafka images.

---

## 🛠️ **Additional Tools**
The project includes a `docker-compose.yml` file that uses various tools to run Kafka locally. Below are the official links for each tool:

- 🔗 **[Apache Kafka (KRaft mode)](https://kafka.apache.org/documentation/#kraft)**: A distributed messaging platform for real-time data streaming, running in KRaft mode which eliminates the need for Zookeeper.
- 🔗 **[Kafka UI - Provectus Labs](https://github.com/provectus/kafka-ui)**: A web interface to monitor topics, partitions, messages, and consumer groups.

---

## 📚 **Learn with me**
This project accompanies the **"Simplifying Kafka"** video series.  Each video  covers a different aspect of the platform, using simple analogies to explain complex concepts. The example code is available for reference and can be adapted as needed.

- 🎥 **Watch the playlist on YouTube**: [youtube.com/@gabrielbragadev](https://youtube.com/@gabrielbragadev)

---

## ▶️ **How to Run**

### Running Kafka locally with Docker

To run Kafka locally for this project, follow these steps:

1. **Generate a new Cluster ID for Kafka KRaft**

    Run the official Kafka container interactively:
    
    ```bash
    docker run -it --rm bitnami/kafka:latest bash
    ```
    
    Inside the container shell, run:
    
    ```
    /opt/bitnami/kafka/bin/kafka-storage.sh random-uuid
    ```
    This command will generate a UUID, <u>copy this value</u>. <br><br>

2. **Update the docker-compose.yml file**

    In the docker-compose.yml, set the environment variable `KAFKA_KRAFT_CLUSTER_ID` with the UUID generated in the 
   previous step. <br><br>

3. **Start the Kafka cluster**
    
    Run:
    ```
    docker-compose up -d
    ```
    
    This will start Kafka in KRaft mode with the correct cluster ID. <br><br>

4. **Check if Kafka is running**
    
    Use the command:
    
    ```
    docker-compose logs -f kafka
    ```
    
    to follow Kafka logs.

---

## 💡 **Contributions**
Contributions and feedback are always welcome! Feel free to share your ideas and suggestions — they are valuable for the improvement of this project. 💡🚀
