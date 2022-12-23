package com.amazonaws.regions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class RegionDefaults {
    public static List<Region> getRegions() {
        ArrayList arrayList = new ArrayList();
        Region e = C13555b.m33966e("af-south-1", "amazonaws.com", arrayList);
        updateRegion(e, ServiceAbbreviations.Autoscaling, "autoscaling.af-south-1.amazonaws.com", false, true);
        updateRegion(e, ServiceAbbreviations.Dynamodb, "dynamodb.af-south-1.amazonaws.com", false, true);
        updateRegion(e, ServiceAbbreviations.EC2, "ec2.af-south-1.amazonaws.com", false, true);
        updateRegion(e, ServiceAbbreviations.ElasticLoadbalancing, "elasticloadbalancing.af-south-1.amazonaws.com", false, true);
        updateRegion(e, "kms", "kms.af-south-1.amazonaws.com", false, true);
        updateRegion(e, "lambda", "lambda.af-south-1.amazonaws.com", false, true);
        updateRegion(e, "logs", "logs.af-south-1.amazonaws.com", false, true);
        updateRegion(e, ServiceAbbreviations.f6722S3, "s3.af-south-1.amazonaws.com", false, true);
        updateRegion(e, ServiceAbbreviations.SNS, "sns.af-south-1.amazonaws.com", false, true);
        updateRegion(e, ServiceAbbreviations.SQS, "sqs.af-south-1.amazonaws.com", false, true);
        Region e2 = C13555b.m33966e("ap-northeast-1", "amazonaws.com", arrayList);
        updateRegion(e2, ServiceAbbreviations.Autoscaling, "autoscaling.ap-northeast-1.amazonaws.com", false, true);
        String str = ServiceAbbreviations.Autoscaling;
        updateRegion(e2, "cognito-identity", "cognito-identity.ap-northeast-1.amazonaws.com", false, true);
        String str2 = "cognito-identity";
        updateRegion(e2, "cognito-idp", "cognito-idp.ap-northeast-1.amazonaws.com", false, true);
        String str3 = "cognito-idp";
        updateRegion(e2, "cognito-sync", "cognito-sync.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, "data.iot", "data.iot.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, ServiceAbbreviations.Dynamodb, "dynamodb.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, ServiceAbbreviations.EC2, "ec2.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, ServiceAbbreviations.ElasticLoadbalancing, "elasticloadbalancing.ap-northeast-1.amazonaws.com", false, true);
        String str4 = ServiceAbbreviations.ElasticLoadbalancing;
        updateRegion(e2, "firehose", "firehose.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, "iot", "iot.ap-northeast-1.amazonaws.com", false, true);
        String str5 = "iot";
        updateRegion(e2, "kinesis", "kinesis.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, "kms", "kms.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, "lambda", "lambda.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, "logs", "logs.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, "polly", "polly.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, ServiceAbbreviations.f6722S3, "s3.ap-northeast-1.amazonaws.com", false, true);
        String str6 = ServiceAbbreviations.f6722S3;
        updateRegion(e2, ServiceAbbreviations.SimpleDB, "sdb.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, ServiceAbbreviations.SNS, "sns.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, ServiceAbbreviations.SQS, "sqs.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(e2, ServiceAbbreviations.STS, "sts.amazonaws.com", false, true);
        Region e3 = C13555b.m33966e("ap-northeast-2", "amazonaws.com", arrayList);
        String str7 = "sts.amazonaws.com";
        ArrayList arrayList2 = arrayList;
        updateRegion(e3, str, "autoscaling.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, str2, "cognito-identity.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, str3, "cognito-idp.ap-northeast-2.amazonaws.com", false, true);
        String str8 = "cognito-sync";
        updateRegion(e3, str8, "cognito-sync.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, "data.iot", "data.iot.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, ServiceAbbreviations.Dynamodb, "dynamodb.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, ServiceAbbreviations.EC2, "ec2.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, str4, "elasticloadbalancing.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, str5, "iot.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, "kinesis", "kinesis.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, "kms", "kms.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, "lambda", "lambda.ap-northeast-2.amazonaws.com", false, true);
        String str9 = "logs";
        updateRegion(e3, str9, "logs.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, "polly", "polly.ap-northeast-2.amazonaws.com", false, true);
        String str10 = str6;
        updateRegion(e3, str10, "s3.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, ServiceAbbreviations.SNS, "sns.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, ServiceAbbreviations.SQS, "sqs.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(e3, ServiceAbbreviations.STS, "sts.ap-northeast-2.amazonaws.com", false, true);
        Region e4 = C13555b.m33966e("ap-south-1", "amazonaws.com", arrayList2);
        String str11 = "amazonaws.com";
        updateRegion(e4, str, "autoscaling.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, str2, "cognito-identity.ap-south-1.amazonaws.com", false, true);
        String str12 = str3;
        updateRegion(e4, str12, "cognito-idp.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, str8, "cognito-sync.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, ServiceAbbreviations.Dynamodb, "dynamodb.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, ServiceAbbreviations.EC2, "ec2.ap-south-1.amazonaws.com", false, true);
        String str13 = ServiceAbbreviations.EC2;
        String str14 = str4;
        updateRegion(e4, str14, "elasticloadbalancing.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, "kinesis", "kinesis.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, "kms", "kms.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, "lambda", "lambda.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, str9, "logs.ap-south-1.amazonaws.com", false, true);
        String str15 = str9;
        String str16 = "polly";
        updateRegion(e4, str16, "polly.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, str10, "s3.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, ServiceAbbreviations.SNS, "sns.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, ServiceAbbreviations.SQS, "sqs.ap-south-1.amazonaws.com", false, true);
        updateRegion(e4, ServiceAbbreviations.STS, str7, false, true);
        Region e5 = C13555b.m33966e("ap-southeast-1", str11, arrayList2);
        String str17 = ServiceAbbreviations.STS;
        updateRegion(e5, str, "autoscaling.ap-southeast-1.amazonaws.com", false, true);
        String str18 = str2;
        updateRegion(e5, str18, "cognito-identity.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, str12, "cognito-idp.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, str8, "cognito-sync.ap-southeast-1.amazonaws.com", false, true);
        String str19 = str8;
        String str20 = "data.iot";
        updateRegion(e5, str20, "data.iot.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, ServiceAbbreviations.Dynamodb, "dynamodb.ap-southeast-1.amazonaws.com", false, true);
        String str21 = ServiceAbbreviations.Dynamodb;
        String str22 = str13;
        updateRegion(e5, str22, "ec2.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, str14, "elasticloadbalancing.ap-southeast-1.amazonaws.com", false, true);
        String str23 = str14;
        String str24 = str5;
        updateRegion(e5, str24, "iot.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, "kinesis", "kinesis.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, "kms", "kms.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, "lambda", "lambda.ap-southeast-1.amazonaws.com", false, true);
        String str25 = str15;
        updateRegion(e5, str25, "logs.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, str16, "polly.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, str10, "s3.ap-southeast-1.amazonaws.com", false, true);
        String str26 = str10;
        updateRegion(e5, ServiceAbbreviations.SimpleDB, "sdb.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, ServiceAbbreviations.SNS, "sns.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, ServiceAbbreviations.SQS, "sqs.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(e5, str17, str7, false, true);
        Region e6 = C13555b.m33966e("ap-southeast-2", str11, arrayList2);
        String str27 = str;
        updateRegion(e6, str27, "autoscaling.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, str18, "cognito-identity.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, str12, "cognito-idp.ap-southeast-2.amazonaws.com", false, true);
        String str28 = str12;
        String str29 = str19;
        updateRegion(e6, str29, "cognito-sync.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, str20, "data.iot.ap-southeast-2.amazonaws.com", false, true);
        String str30 = str20;
        String str31 = str21;
        updateRegion(e6, str31, "dynamodb.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, str22, "ec2.ap-southeast-2.amazonaws.com", false, true);
        String str32 = str29;
        String str33 = str23;
        updateRegion(e6, str33, "elasticloadbalancing.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, str24, "iot.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, "kinesis", "kinesis.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, "kms", "kms.ap-southeast-2.amazonaws.com", false, true);
        String str34 = str24;
        String str35 = "lambda";
        updateRegion(e6, str35, "lambda.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, str25, "logs.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, str16, "polly.ap-southeast-2.amazonaws.com", false, true);
        String str36 = str18;
        updateRegion(e6, str26, "s3.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, ServiceAbbreviations.SimpleDB, "sdb.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, ServiceAbbreviations.SNS, "sns.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(e6, ServiceAbbreviations.SQS, "sqs.ap-southeast-2.amazonaws.com", false, true);
        String str37 = str7;
        updateRegion(e6, str17, str37, false, true);
        Region e7 = C13555b.m33966e("ca-central-1", str11, arrayList2);
        updateRegion(e7, str27, "autoscaling.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, str31, "dynamodb.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, str22, "ec2.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, str33, "elasticloadbalancing.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, "kinesis", "kinesis.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, "kms", "kms.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, str35, "lambda.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, str25, "logs.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, str16, "polly.ca-central-1.amazonaws.com", false, true);
        String str38 = str16;
        String str39 = str26;
        updateRegion(e7, str39, "s3.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, ServiceAbbreviations.SNS, "sns.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, ServiceAbbreviations.SQS, "sqs.ca-central-1.amazonaws.com", false, true);
        updateRegion(e7, str17, str37, false, true);
        Region e8 = C13555b.m33966e("eu-central-1", str11, arrayList2);
        updateRegion(e8, str27, "autoscaling.eu-central-1.amazonaws.com", false, true);
        String str40 = str27;
        updateRegion(e8, str36, "cognito-identity.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, str28, "cognito-idp.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, str32, "cognito-sync.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, str30, "data.iot.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, str31, "dynamodb.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, str22, "ec2.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, str33, "elasticloadbalancing.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, "firehose", "firehose.eu-central-1.amazonaws.com", false, true);
        String str41 = str34;
        updateRegion(e8, str41, "iot.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, "kinesis", "kinesis.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, "kms", "kms.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, str35, "lambda.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, str25, "logs.eu-central-1.amazonaws.com", false, true);
        String str42 = str38;
        updateRegion(e8, str42, "polly.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, str39, "s3.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, ServiceAbbreviations.SNS, "sns.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, ServiceAbbreviations.SQS, "sqs.eu-central-1.amazonaws.com", false, true);
        updateRegion(e8, str17, str37, false, true);
        String str43 = str11;
        ArrayList arrayList3 = arrayList2;
        Region e9 = C13555b.m33966e("eu-south-1", str43, arrayList3);
        String str44 = str42;
        String str45 = "kinesis";
        String str46 = str40;
        updateRegion(e9, str46, "autoscaling.eu-south-1.amazonaws.com", false, true);
        updateRegion(e9, str31, "dynamodb.eu-south-1.amazonaws.com", false, true);
        updateRegion(e9, str22, "ec2.eu-south-1.amazonaws.com", false, true);
        updateRegion(e9, str33, "elasticloadbalancing.eu-south-1.amazonaws.com", false, true);
        updateRegion(e9, str35, "lambda.eu-south-1.amazonaws.com", false, true);
        updateRegion(e9, str25, "logs.eu-south-1.amazonaws.com", false, true);
        updateRegion(e9, str39, "s3.eu-south-1.amazonaws.com", false, true);
        updateRegion(e9, ServiceAbbreviations.SNS, "sns.eu-south-1.amazonaws.com", false, true);
        updateRegion(e9, ServiceAbbreviations.SQS, "sqs.eu-south-1.amazonaws.com", false, true);
        Region e11 = C13555b.m33966e("eu-west-1", str43, arrayList3);
        updateRegion(e11, str46, "autoscaling.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str36, "cognito-identity.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str28, "cognito-idp.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str32, "cognito-sync.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str30, "data.iot.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str31, "dynamodb.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str22, "ec2.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str33, "elasticloadbalancing.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, "email", "email.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, "firehose", "firehose.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str41, "iot.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str45, "kinesis.eu-west-1.amazonaws.com", false, true);
        String str47 = "kms";
        updateRegion(e11, str47, "kms.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str35, "lambda.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str25, "logs.eu-west-1.amazonaws.com", false, true);
        String str48 = str25;
        updateRegion(e11, "machinelearning", "machinelearning.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str44, "polly.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, "rekognition", "rekognition.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, str39, "s3.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, ServiceAbbreviations.SimpleDB, "sdb.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, ServiceAbbreviations.SNS, "sns.eu-west-1.amazonaws.com", false, true);
        updateRegion(e11, ServiceAbbreviations.SQS, "sqs.eu-west-1.amazonaws.com", false, true);
        String str49 = str17;
        String str50 = str37;
        updateRegion(e11, str49, str50, false, true);
        Region e12 = C13555b.m33966e("eu-west-2", str43, arrayList3);
        ArrayList arrayList4 = arrayList3;
        String str51 = str43;
        updateRegion(e12, str40, "autoscaling.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, str36, "cognito-identity.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, str28, "cognito-idp.eu-west-2.amazonaws.com", false, true);
        String str52 = str32;
        updateRegion(e12, str52, "cognito-sync.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, str31, "dynamodb.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, str22, "ec2.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, str33, "elasticloadbalancing.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, str41, "iot.eu-west-2.amazonaws.com", false, true);
        String str53 = str41;
        String str54 = str45;
        updateRegion(e12, str54, "kinesis.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, str47, "kms.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, str35, "lambda.eu-west-2.amazonaws.com", false, true);
        String str55 = str52;
        updateRegion(e12, str48, "logs.eu-west-2.amazonaws.com", false, true);
        String str56 = str44;
        updateRegion(e12, str56, "polly.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, str39, "s3.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, ServiceAbbreviations.SNS, "sns.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, ServiceAbbreviations.SQS, "sqs.eu-west-2.amazonaws.com", false, true);
        updateRegion(e12, str49, str50, false, true);
        String str57 = str51;
        Region e13 = C13555b.m33966e("eu-west-3", str57, arrayList4);
        String str58 = str57;
        String str59 = str49;
        String str60 = str40;
        updateRegion(e13, str60, "autoscaling.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, str31, "dynamodb.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, str22, "ec2.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, str33, "elasticloadbalancing.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, str54, "kinesis.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, str47, "kms.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, str35, "lambda.eu-west-3.amazonaws.com", false, true);
        String str61 = str35;
        String str62 = str48;
        updateRegion(e13, str62, "logs.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, str56, "polly.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, str39, "s3.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, ServiceAbbreviations.SNS, "sns.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, ServiceAbbreviations.SQS, "sqs.eu-west-3.amazonaws.com", false, true);
        updateRegion(e13, str59, str50, false, true);
        Region e14 = C13555b.m33966e("sa-east-1", str58, arrayList4);
        updateRegion(e14, str60, "autoscaling.sa-east-1.amazonaws.com", false, true);
        updateRegion(e14, str31, "dynamodb.sa-east-1.amazonaws.com", false, true);
        updateRegion(e14, str22, "ec2.sa-east-1.amazonaws.com", false, true);
        updateRegion(e14, str33, "elasticloadbalancing.sa-east-1.amazonaws.com", false, true);
        updateRegion(e14, str54, "kinesis.sa-east-1.amazonaws.com", false, true);
        updateRegion(e14, str47, "kms.sa-east-1.amazonaws.com", false, true);
        String str63 = str47;
        String str64 = str61;
        updateRegion(e14, str64, "lambda.sa-east-1.amazonaws.com", false, true);
        updateRegion(e14, str62, "logs.sa-east-1.amazonaws.com", false, true);
        updateRegion(e14, str56, "polly.sa-east-1.amazonaws.com", false, true);
        updateRegion(e14, str39, "s3.sa-east-1.amazonaws.com", false, true);
        String str65 = str39;
        updateRegion(e14, ServiceAbbreviations.SimpleDB, "sdb.sa-east-1.amazonaws.com", false, true);
        updateRegion(e14, ServiceAbbreviations.SNS, "sns.sa-east-1.amazonaws.com", false, true);
        updateRegion(e14, ServiceAbbreviations.SQS, "sqs.sa-east-1.amazonaws.com", false, true);
        String str66 = str59;
        updateRegion(e14, str66, str50, false, true);
        Region e15 = C13555b.m33966e("us-east-1", str58, arrayList4);
        updateRegion(e15, str60, "autoscaling.us-east-1.amazonaws.com", false, true);
        String str67 = str60;
        updateRegion(e15, str36, "cognito-identity.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str28, "cognito-idp.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str55, "cognito-sync.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str30, "data.iot.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str31, "dynamodb.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str22, "ec2.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str33, "elasticloadbalancing.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, "email", "email.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, "firehose", "firehose.us-east-1.amazonaws.com", false, true);
        String str68 = str53;
        updateRegion(e15, str68, "iot.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str54, "kinesis.us-east-1.amazonaws.com", false, true);
        String str69 = str54;
        String str70 = str63;
        updateRegion(e15, str70, "kms.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str64, "lambda.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str62, "logs.us-east-1.amazonaws.com", false, true);
        String str71 = str62;
        updateRegion(e15, "machinelearning", "machinelearning.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, "mobileanalytics", "mobileanalytics.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, "pinpoint", "pinpoint.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str56, "polly.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, "rekognition", "rekognition.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str65, "s3.amazonaws.com", false, true);
        updateRegion(e15, ServiceAbbreviations.SimpleDB, "sdb.amazonaws.com", false, true);
        updateRegion(e15, ServiceAbbreviations.SNS, "sns.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, ServiceAbbreviations.SQS, "sqs.us-east-1.amazonaws.com", false, true);
        updateRegion(e15, str66, str50, false, true);
        Region e16 = C13555b.m33966e("us-east-2", str58, arrayList4);
        updateRegion(e16, str67, "autoscaling.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str36, "cognito-identity.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str28, "cognito-idp.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str55, "cognito-sync.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str31, "dynamodb.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str22, "ec2.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str33, "elasticloadbalancing.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, "firehose", "firehose.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str68, "iot.us-east-2.amazonaws.com", false, true);
        String str72 = str69;
        updateRegion(e16, str72, "kinesis.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str70, "kms.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str64, "lambda.us-east-2.amazonaws.com", false, true);
        String str73 = str68;
        String str74 = str71;
        updateRegion(e16, str74, "logs.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str56, "polly.us-east-2.amazonaws.com", false, true);
        String str75 = str56;
        String str76 = str65;
        updateRegion(e16, str76, "s3.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, ServiceAbbreviations.SNS, "sns.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, ServiceAbbreviations.SQS, "sqs.us-east-2.amazonaws.com", false, true);
        updateRegion(e16, str66, str50, false, true);
        Region e17 = C13555b.m33966e("us-west-1", str58, arrayList4);
        String str77 = str66;
        String str78 = str67;
        updateRegion(e17, str78, "autoscaling.us-west-1.amazonaws.com", false, true);
        updateRegion(e17, str31, "dynamodb.us-west-1.amazonaws.com", false, true);
        updateRegion(e17, str22, "ec2.us-west-1.amazonaws.com", false, true);
        updateRegion(e17, str33, "elasticloadbalancing.us-west-1.amazonaws.com", false, true);
        updateRegion(e17, str72, "kinesis.us-west-1.amazonaws.com", false, true);
        updateRegion(e17, str70, "kms.us-west-1.amazonaws.com", false, true);
        updateRegion(e17, str64, "lambda.us-west-1.amazonaws.com", false, true);
        updateRegion(e17, str74, "logs.us-west-1.amazonaws.com", false, true);
        String str79 = str74;
        String str80 = str75;
        updateRegion(e17, str80, "polly.us-west-1.amazonaws.com", false, true);
        updateRegion(e17, str76, "s3.us-west-1.amazonaws.com", false, true);
        String str81 = str76;
        updateRegion(e17, ServiceAbbreviations.SimpleDB, "sdb.us-west-1.amazonaws.com", false, true);
        updateRegion(e17, ServiceAbbreviations.SNS, "sns.us-west-1.amazonaws.com", false, true);
        updateRegion(e17, ServiceAbbreviations.SQS, "sqs.us-west-1.amazonaws.com", false, true);
        String str82 = str77;
        updateRegion(e17, str82, str50, false, true);
        Region e18 = C13555b.m33966e("us-west-2", str58, arrayList4);
        updateRegion(e18, str78, "autoscaling.us-west-2.amazonaws.com", false, true);
        String str83 = str78;
        updateRegion(e18, str36, "cognito-identity.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str28, "cognito-idp.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str55, "cognito-sync.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str30, "data.iot.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str31, "dynamodb.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str22, "ec2.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str33, "elasticloadbalancing.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, "email", "email.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, "firehose", "firehose.us-west-2.amazonaws.com", false, true);
        String str84 = str73;
        updateRegion(e18, str84, "iot.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str72, "kinesis.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str70, "kms.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str64, "lambda.us-west-2.amazonaws.com", false, true);
        String str85 = str70;
        String str86 = str79;
        updateRegion(e18, str86, "logs.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str80, "polly.us-west-2.amazonaws.com", false, true);
        String str87 = str80;
        updateRegion(e18, "rekognition", "rekognition.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str81, "s3.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, ServiceAbbreviations.SimpleDB, "sdb.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, ServiceAbbreviations.SNS, "sns.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, ServiceAbbreviations.SQS, "sqs.us-west-2.amazonaws.com", false, true);
        updateRegion(e18, str82, str50, false, true);
        ArrayList arrayList5 = arrayList4;
        Region e19 = C13555b.m33966e("cn-north-1", "amazonaws.com.cn", arrayList5);
        String str88 = str50;
        updateRegion(e19, str83, "autoscaling.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, str36, "cognito-identity.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, str31, "dynamodb.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, str22, "ec2.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, str33, "elasticloadbalancing.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, str84, "iot.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, str72, "kinesis.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, str64, "lambda.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, str86, "logs.cn-north-1.amazonaws.com.cn", false, true);
        String str89 = str81;
        updateRegion(e19, str89, "s3.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, ServiceAbbreviations.SNS, "sns.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, ServiceAbbreviations.SQS, "sqs.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(e19, str82, "sts.cn-north-1.amazonaws.com.cn", false, true);
        Region e21 = C13555b.m33966e("cn-northwest-1", "amazonaws.com.cn", arrayList5);
        String str90 = str84;
        String str91 = str83;
        updateRegion(e21, str91, "autoscaling.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(e21, str31, "dynamodb.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(e21, str22, "ec2.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(e21, str33, "elasticloadbalancing.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(e21, str72, "kinesis.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(e21, str86, "logs.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(e21, str89, "s3.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(e21, ServiceAbbreviations.SNS, "sns.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(e21, ServiceAbbreviations.SQS, "sqs.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(e21, str82, "sts.amazonaws.com.cn", false, true);
        Region e22 = C13555b.m33966e("us-gov-west-1", str58, arrayList5);
        updateRegion(e22, str91, "autoscaling.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(e22, str31, "dynamodb.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(e22, str22, "ec2.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(e22, str33, "elasticloadbalancing.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(e22, str72, "kinesis.us-gov-west-1.amazonaws.com", false, true);
        String str92 = str72;
        String str93 = str85;
        updateRegion(e22, str93, "kms.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(e22, str64, "lambda.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(e22, str86, "logs.us-gov-west-1.amazonaws.com", false, true);
        String str94 = str86;
        updateRegion(e22, "rekognition", "rekognition.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(e22, str89, "s3.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(e22, ServiceAbbreviations.SNS, "sns.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(e22, ServiceAbbreviations.SQS, "sqs.us-gov-west-1.amazonaws.com", false, true);
        String str95 = str88;
        updateRegion(e22, str82, str95, false, true);
        String str96 = str58;
        Region e23 = C13555b.m33966e("eu-north-1", str96, arrayList5);
        ArrayList arrayList6 = arrayList5;
        updateRegion(e23, str91, "autoscaling.eu-north-1.amazonaws.com", false, true);
        updateRegion(e23, str31, "dynamodb.eu-north-1.amazonaws.com", false, true);
        updateRegion(e23, str22, "ec2.eu-north-1.amazonaws.com", false, true);
        updateRegion(e23, str33, "elasticloadbalancing.eu-north-1.amazonaws.com", false, true);
        String str97 = str33;
        updateRegion(e23, "firehose", "firehose.eu-north-1.amazonaws.com", false, true);
        updateRegion(e23, str90, "iot.eu-north-1.amazonaws.com", false, true);
        String str98 = str92;
        updateRegion(e23, str98, "kinesis.eu-north-1.amazonaws.com", false, true);
        updateRegion(e23, str93, "kms.eu-north-1.amazonaws.com", false, true);
        updateRegion(e23, str64, "lambda.eu-north-1.amazonaws.com", false, true);
        String str99 = str64;
        String str100 = str94;
        updateRegion(e23, str100, "logs.eu-north-1.amazonaws.com", false, true);
        updateRegion(e23, str89, "s3.eu-north-1.amazonaws.com", false, true);
        updateRegion(e23, ServiceAbbreviations.SNS, "sns.eu-north-1.amazonaws.com", false, true);
        updateRegion(e23, ServiceAbbreviations.SQS, "sqs.eu-north-1.amazonaws.com", false, true);
        updateRegion(e23, str82, str95, false, true);
        Region e24 = C13555b.m33966e("ap-east-1", str96, arrayList6);
        updateRegion(e24, str91, "autoscaling.ap-east-1.amazonaws.com", false, true);
        updateRegion(e24, str31, "dynamodb.ap-east-1.amazonaws.com", false, true);
        updateRegion(e24, str22, "ec2.ap-east-1.amazonaws.com", false, true);
        String str101 = str22;
        updateRegion(e24, str97, "elasticloadbalancing.ap-east-1.amazonaws.com", false, true);
        updateRegion(e24, "firehose", "firehose.ap-east-1.amazonaws.com", false, true);
        updateRegion(e24, str98, "kinesis.ap-east-1.amazonaws.com", false, true);
        updateRegion(e24, str93, "kms.ap-east-1.amazonaws.com", false, true);
        String str102 = str99;
        updateRegion(e24, str102, "lambda.ap-east-1.amazonaws.com", false, true);
        updateRegion(e24, str100, "logs.ap-east-1.amazonaws.com", false, true);
        String str103 = str100;
        String str104 = str87;
        updateRegion(e24, str104, "polly.ap-east-1.amazonaws.com", false, true);
        updateRegion(e24, str89, "s3.ap-east-1.amazonaws.com", false, true);
        updateRegion(e24, ServiceAbbreviations.SNS, "sns.ap-east-1.amazonaws.com", false, true);
        updateRegion(e24, ServiceAbbreviations.SQS, "sqs.ap-east-1.amazonaws.com", false, true);
        updateRegion(e24, str82, str95, false, true);
        ArrayList arrayList7 = arrayList6;
        Region e25 = C13555b.m33966e("me-south-1", str96, arrayList7);
        updateRegion(e25, str91, "autoscaling.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str36, "cognito-identity.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str28, "cognito-idp.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str55, "cognito-sync.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str30, "data.iot.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str31, "dynamodb.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str101, "ec2.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str97, "elasticloadbalancing.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, "firehose", "firehose.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str90, "iot.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str98, "kinesis.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str93, "kms.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str102, "lambda.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str103, "logs.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str104, "polly.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str89, "s3.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, ServiceAbbreviations.SimpleDB, "sdb.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, ServiceAbbreviations.SNS, "sns.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, ServiceAbbreviations.SQS, "sqs.me-south-1.amazonaws.com", false, true);
        updateRegion(e25, str82, str95, false, true);
        return arrayList7;
    }

    private static void updateRegion(Region region, String str, String str2, boolean z, boolean z2) {
        Map<String, String> serviceEndpoints = region.getServiceEndpoints();
        Map<String, Boolean> httpSupport = region.getHttpSupport();
        Map<String, Boolean> httpsSupport = region.getHttpsSupport();
        serviceEndpoints.put(str, str2);
        httpSupport.put(str, Boolean.valueOf(z));
        httpsSupport.put(str, Boolean.valueOf(z2));
    }
}