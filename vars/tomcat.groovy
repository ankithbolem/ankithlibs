def call(ip,user)
{
                  sshagent(['dada']) {
             // copy war file
                    sh "scp -o StrictHostKeyChecking=no target/*.war ${user}@${ip}:/opt/tomcat9/webapps"
             // shutdown server
             sh "ssh -o StrictHostKeyChecking=no ${user}@${ip} /opt/tomcat9/bin/shutdown.sh"
             // start server
             sh "ssh ${user}@${ip} /opt/tomcat9/bin/startup.sh"

                  }
}
