# events-ms
This project goes with the DevWidgets YouTube video series https://youtu.be/FCOcTUV2KAo

If you are not using IDE integrated SAM CLI plugin you should be able to run the following commands to build, package 
and deploy

##Build
```
/usr/local/bin/sam build --template /path/to/events-ms/template.yaml --build-dir /path/to/events-ms/.aws-sam/build
```

##Package 
```
/usr/local/bin/sam package --template-file /path/to/events-ms/.aws-sam/build/template.yaml --output-template-file /path/to/events-ms/.aws-sam/build/packaged-template.yaml --s3-bucket your.s3.bucket
```

##Deploy
```
/usr/local/bin/sam deploy --template-file /path/to/events-ms/.aws-sam/build/packaged-template.yaml --stack-name events-ms --s3-bucket your.s3.bucket --capabilities CAPABILITY_IAM CAPABILITY_NAMED_IAM --no-execute-changeset
```
