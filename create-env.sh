CONTEXT=camel

minikube start -p $CONTEXT --cpus=2 --memory=4096

kubectl config use-context $CONTEXT

helm repo add strimzi https://strimzi.io/charts/
helm install strimzi/strimzi-kafka-operator

