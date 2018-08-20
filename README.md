## 1. Start zookeeper
> bin/zookeeper-server-start.sh config/zookeeper.properties

## 2. Start Kafka
> bin/kafka-server-start.sh config/server.properties

## 3. Create Topic
> bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic sample-topic

## 4. Start Producer
> bin/kafka-console-producer.sh --broker-list localhost:9092 --topic sample-topic

## 5. Start Consumer
> bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic sample-topic --from-beginning
