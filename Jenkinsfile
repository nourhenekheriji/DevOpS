pipeline {
       agent any
        stages{
            stage('Checkout GIT'){
                steps{
                    echo 'Pulling...';
                   // git branch: 'main',
                    git branch:'nourheneBack'
                   // credentialsId: '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',
                  //  url : 'https://github.com/nourhenekheriji/DevOpS.git';
                    url :'https://github.com/khalsibadis/devOps-Backend.git'
                             }
                             }

            stage('MVN CLEAN')
            {
                steps{
                sh  'mvn clean'
                }
            }
            stage('MVN COMPILE')
            {
                steps{
                sh  'mvn compile'
                }
            }


                     stage('Test'){
                               steps{
                                         sh  'mvn test'
                                              }
                                        }
                    stage('MVN SONARQUBE ')
                                            {
                                                steps{
                                                sh  'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=esprit'
                                                }
                                            }
                        stage('deploy nexus'){
                                                      steps{
                                                                 sh 'mvn  deploy'
                                                                     }
                                                               }


                    stage('Build docker image'){
                         steps{
                                sh 'docker build -t nourhenekheriji/springback .'

                                      }
                                         }

                                              stage('Docker login') {

                                                         steps {
                                                            sh 'echo "login Docker ...."'
                                                                	sh 'docker login -u nourhenekheriji -p Nourhene1234'
                                                                            }  }


          stage('Docker push') {

                           steps {
                                sh 'echo "Docker is pushing ...."'
                               	sh 'docker push nourhenekheriji/springback'
                                  }  }



          stage('DOCKER COMPOSE') {
                   steps {
                      sh 'docker-compose up -d --build'
                   }
              }


        /*   stage("Email Notification"){
                  success {

                        emailext body: 'Pipeline build successfully', subject: 'Pipeline build', to: 'nourhenekh20@gmail.com'
                      }
                      failure {

                        emailext body: 'Pipeline build not success', subject: 'Pipeline build', to: 'nourhenekh20@gmail.com'
                      }
            }*/


	}
}


