pipeline{
    agent any
    tools{
        maven 'MAVEN_HOME'
    }
    environment {
	    	APP_NAME = "payment-service"
            RELEASE = "1.0.0"
            DOCKER_USER = "radhika17"
	    	DOCKER_PASS = 'dockerpassword'
	    	DOCKER_IMAGE_NAME = "${DOCKER_USER}/${APP_NAME}"
            DOCKER_IMAGE_TAG = "${RELEASE}-${BUILD_NUMBER}"
     }
    stages{    
        stage("Cleanup Workspace") {
            steps {
                deleteDir()
            }
        }
        stage('Clone code from Git'){
            steps{
            checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/walmart-2023-sep-ascend/Team06-Payment-module.git']])
            }
        }
        stage('Build Application'){
            steps{
            bat 'mvn clean install'
            }
        }
        stage('Test Application'){
            steps{
            bat 'mvn test'
            }
        }
        stage('Code Analysis'){
            steps{
            bat 'mvn pmd:pmd'
            }
        }
        
        stage('Build Docker image'){
            steps{
                script{
                    bat 'docker build -t payment-service .'
                }
            }
        }
       // stage('Build Docker image'){
      //      steps{
      //          script{
       //             bat 'docker build -t payment-service .'
      //          }
      //      }
      //  }
      //stage('Push image to Docker hub'){
        //    steps{
        //        script{
        //            withCredentials([string(credentialsId: 'dockerpwd', variable: 'dockerpassword')]) {
        //            bat 'docker login -u radhika17 -p ${dockerpassword}'
        //            bat 'docker push inventory-update-docker.jar'
        //}
               // }
        //    }
        //}
      //  stage("Build & Push Docker Image") {
      //      steps {
      //          script {
       //             docker.withRegistry('',DOCKER_PASS) {
        //                docker_image = docker.build("${DOCKER_IMAGE_NAME}")
         //           }

        //            docker.withRegistry('',DOCKER_PASS) {
       //                 docker_image.push("${DOCKER_IMAGE_TAG}")
        //                docker_image.push('latest')
       //             }
      //          }
     //       }
    //   }
    }
}
