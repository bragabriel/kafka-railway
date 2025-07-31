# **Descomplicando Kafka: A Ferrovia das Mensagens** 🚂

---

 🎥 **Assista à playlist no YouTube**: [youtube.com/@gabrielbragadev](https://youtube.com/@gabrielbragadev) 🔗 

 🐙 **Acesse o repositório no GitHub**: [github.com/bragabriel](github.com/bragabriel/products-api-java) 🔗

---

## **Visão Geral**
[Kafka](https://kafka.apache.org) é uma plataforma de **mensageria** distribuída extremamente poderosa. No entanto, pode ser desafiador entender seu funcionamento se você não estiver familiarizado com seus conceitos principais. O **objetivo** deste projeto é <u>simplificar o aprendizado de Kafka</u> utilizando uma analogia divertida e de fácil entendimento com trens e ferrovias 🚜 — tornando os conceitos tão claros que até mesmo uma criança poderia compreender.

A série **[Descomplicando Kafka](TODO)** (🎥 <u>disponível no YouTube</u>) explora, episódio por episódio, como cada parte do Kafka funciona, explicando conceitos como **produtores**, **consumidores**, **brokers**, **partições**, **offsets**, e muito mais — tudo de forma simplificada e acessível. 😉

---

##  📺 **Episódios**
Cada vídeo é dedicado a um aspecto fundamental do Kafka, utilizando a analogia de uma ferrovia para facilitar o entendimento. Aqui estão os tópicos abordados:

| **#** | **Episódio**                                | **Descrição**                                                                                                              |
|-------|--------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|
| **1** | **Introdução**                             | *"Descomplicando Kafka: Explicando Kafka Como se Você Tivesse 5 Anos!"* - Apresentação do aprendizado de Kafka de forma simples. |
| **2** | **Tópico → Trilho**                        | *"Descomplicando Kafka: Como os Trens Encontram Seu Caminho"* - Como os dados (mensagens) seguem por trilhos (tópicos).    |
| **3** | **Produtor → Fazendeiro**                  | *"Descomplicando Kafka: Como os Fazendeiros Enviam Produtos (Mensagens) Para a Cidade"* - O papel do produtor na entrega.  |
| **4** | **Mensagem → Produtos no Vagão**           | *"Descomplicando Kafka: Como as Mensagens São Carregadas nos Vagões"* - Como as mensagens são organizadas e transportadas. |
| **5** | **Broker → Estação de Trem**               | *"Descomplicando Kafka: O Papel da Estação de Trem (Broker) no Mundo do Kafka"* - Como os brokers facilitam a entrega.    |
| **6** | **Partição → Trilho Específico**           | *"Descomplicando Kafka: Evitando Congestionamento nos Trilhos (Partições)"* - Divisão de mensagens entre partições.       |
| **7** | **Hot Partition → Vagão Sobrecargado**     | *"Descomplicando Kafka: O Que Acontece Quando Um Vagão Fica Cheio Demais (Hot Partitions)"* - Impacto da sobrecarga.      |
| **8** | **Consumer Group → Rede de Mercados**      | *"Descomplicando Kafka: Como Dividir a Carga de Produtos Entre os Mercados"* - Trabalho em equipe dos consumidores.        |
| **9** | **Rebalance → Mudança na Logística**       | *"Descomplicando Kafka: Como Re-Organizar os Vagões se um deles quebrar? (Rebalance)"* - Redistribuição de mensagens.      |
| **10**| **Offset → Ponto de Partida**              | *"Descomplicando Kafka: Como Saber Onde Começar a Pegar os Produtos (Offsets)"* - Rastreamento das mensagens.              |
| **11**| **Producer Acknowledgment → Confirmação**  | *"Descomplicando Kafka: Como o Fazendeiro Sabe Que Seus Produtos Chegaram no Destino"* - Garantias de entrega.            |

---

## 💻 **Tecnologias Utilizadas**
- **Java**: Linguagem principal para implementar o exemplo de Kafka.
- **Spring Boot**: Framework para simplificar o desenvolvimento.
- **Apache Kafka**: Plataforma de mensageria distribuída.
- **Docker**: Para facilitar a execução local com imagens do Kafka.

---

## 🛠️ **Ferramentas Adicionais**

O projeto inclui um arquivo `docker-compose.yml` que utiliza ferramentas para rodar o Kafka localmente em modo KRaft. Abaixo estão os links para as páginas oficiais de cada ferramenta usada:

- 🔗 **[Apache Kafka (modo KRaft)](https://kafka.apache.org/documentation/#kraft)**: Plataforma de mensageria distribuída para transmissão de dados em tempo real, rodando no modo KRaft, que dispensa o uso do Zookeeper.
- 🔗 **[Kafka UI - Provectus Labs](https://github.com/provectus/kafka-ui)**: Interface web para monitorar tópicos, partições, mensagens e grupos de consumidores.

---

## 📚 **Aprenda Comigo**
Este projeto acompanha a série de vídeos **"Descomplicando Kafka"**. Cada vídeo aborda um aspecto diferente da plataforma, utilizando analogias simples para ensinar conceitos complexos. O código de exemplo está disponível para acompanhamento e pode ser adaptado conforme necessário.

- 🎥 **Assista à playlist no YouTube**: [youtube.com/@gabrielbragadev](https://youtube.com/@gabrielbragadev)

---

## ▶️ **Como Rodar**

### Rodando o Kafka localmente com Docker

Para rodar o Kafka localmente neste projeto, siga os passos:

1. **Gerar um novo Cluster ID para Kafka KRaft**
   1. Execute o container oficial do Kafka em modo interativo:
    
       ```bash
       docker run -it --rm bitnami/kafka:latest bash
       ```
    
   2. Dentro do shell do container, rode:
    
       ```
       /opt/bitnami/kafka/bin/kafka-storage.sh random-uuid
       ```
   3. Esse comando vai gerar um UUID — **<u>copie esse valor</u>**. <br><br>

2. **Atualize o arquivo docker-compose.yml**
    
    * No docker-compose.yml, configure a variável de ambiente `KAFKA_KRAFT_CLUSTER_ID` com o UUID gerado no passo 
   anterior.<br><br>

3. **Inicie o cluster Kafka**

   Execute:
    ```
    docker-compose up -d
    ```
    Isso vai subir o Kafka no modo KRaft com o cluster ID correto.<br><br>

4. **Verifique se o Kafka está rodando**

    Use o comando:
    ```
    docker-compose logs -f kafka
    ```
    para acompanhar os logs do Kafka.

--- 

## 💡**Contribuições**
Contribuições e feedbacks são sempre bem-vindos! Fique à vontade para compartilhar suas ideias e sugestões. Elas são 
muito importantes para o aprimoramento do projeto. 💡🚀