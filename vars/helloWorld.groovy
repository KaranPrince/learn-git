pipeline{
    agent any
    stages{
        stage('parallel-stages'){
        parallel{
            stage('p-s-1'){
                steps{
                    script{
                        for (int i=1; i<=10; i++){
                            echo "number $i"
                        }
                    }
                }
            }
            stage('p-s-2'){
                steps{
                    script{
                        for (int i=1; i<=10; i++){
                            echo "hello $i"
                        }
                    }
                }
            }

        }
    }
}
}