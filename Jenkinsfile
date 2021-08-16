pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'Build stage has started'
        sh 'mvn install'
      }
    }

    stage('tests') {
      parallel {
        stage('Linux tests') {
          steps {
            echo 'Run Linux tests'
          }
        }

        stage('Windows tests') {
          agent any
          steps {
            echo 'Tests in WIndows'
          }
        }

      }
    }

    stage('Deploy staging') {
      steps {
        echo 'Deploy staging'
        sh 'sh deploy_staging.sh'
      }
    }

    stage('Deploy production') {
      steps {
        echo 'Deployment in production'
      }
    }

  }
}