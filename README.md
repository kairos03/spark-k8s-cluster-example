# install
```
helm repo add bitnami https://charts.bitnami.com/bitnami
helm install spark bitnami/spark -f values.yaml
```

# upgrade (update values.yaml)
```
helm upgrade -f values.yaml spark bitnami/spark
```

# submit job

jar 파일 및 분석에 사용되는 데이터는 반드시 /data/shared2 아래 폴더에 있어야 합니다.
```
spark-submit \ 
  --master spark://spark-master-0.spark-headless.spark.svc.cluster.local:7077 \
  --deploy-mode cluster \
  --executor-memory 20G \
  --executor-cores 2 \
  --class com.omnious.example.Hello \
  /data/shared2/test-spark.jar
```

---
# SPARK scala project
## create new project
```
sbt new scala/scala-seed.g8
```
