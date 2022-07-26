# install
helm repo add bitnami https://charts.bitnami.com/bitnami
helm install spark bitnami/spark -f values.yaml

# upgrade (update values.yaml)
helm upgrade -f values.yaml spark bitnami/spark


# submit job
spark-submit \ 
  --master spark://spark-master-0.spark-headless.spark.svc.cluster.local:7077 \
  --executor-memory 20G \
  --executor-cores 2 \
  examples/src/main/python/pi.py 10
