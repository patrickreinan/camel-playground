EXPORT_DIR=./exported
SRC_DIR=$EXPORT_DIR/src

rm -rf $EXPORT_DIR 

mkdir $EXPORT_DIR

cp application.properties ./$EXPORT_DIR
cp dummy.yaml ./$EXPORT_DIR

cd $EXPORT_DIR

camel export \
        --runtime=spring-boot \
        --gav=com.patrickreinan:dummy:1.0.0 \
        --fresh \
        --directory=$SRC_DIR 
        
cd $SRC_DIR
mvn install

TESTVAR="Test Var log message" \
DUMMY_PROP_LOG_MESSAGE="MESSAGE OVERRIDED" \
CAMEL_COMPONENT_REST_HOST="localhost:8081" \
MANAGEMENT_ENDPOINTS_WEB_EXPOSURE_INCLUDE=info,health,camel \
MANAGEMENT_ENDPOINTS_WEB_EXPOSURE_HOST=localhost:8082 \
java -jar target/dummy-1.0.0.jar 





