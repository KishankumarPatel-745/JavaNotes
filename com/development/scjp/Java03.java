package com.development.scjp;


public class Java03 {
    public static void main(String[] args) {
        
        /*
        jar vs war vs ear.
        =================

        jar(java archive)
        
        It contains a group of .class files.

        war(web archive)

        a war file represents one web application, which contains servlets,JSPs, Htmls and js files,etc.

        The main advantage of maintaining web application in the form of war file is project deployment, project delivery and project tranfortation will become easy.

        ear file.(enterprise archive)

        A ear file represents one enterprise application, which contains servlet,JSPs, EJBs and JMS component,etc.

        Note:
        In general, ear file represents a group of war file and jar file.

        Web application VS enterprise application.

        A web application can be developed by only web related technologies, like servlet, jsps, html,js,css,xml,etc.

        eg. online library management system, online shopping cart.

        An enterprice application can be developed by any technology from java j2ee like servlet,jsp,ejbs,jms component etc.

        eg, banking application, telecom base application.

        NOTE..
        J2EE or JEE compatible application is enterprise application.



        Web Server VS Application Server.

        Web server provides environment to run web application.

        web server provides supports for web related technologies like servlets,jsps, html etc.

        Application server provide environment to run enterprise application. Application server can provide support for any technology from java j2ee like servlets,ejbs ,jms components etc.

        weblogic, web sprear, jboss etc.

        NOTE:
        every application server contains in-built web server to provide support for web related technologies.

        j2ee compatible server is application server.


        How to create executable jar files.

        eg.
        import java.awt.*;
        import java.awt.event.*;
        public class JarDemo{
            main(){
                Frame f=new Frame();
                f.addWindowListener(new WindowAdapter(){
                    for(int i=1;i<=10;i++){
                        SOP("i am closing window:"+i);                    }
                        System.exit(0);
                })
                f.add(new Label("i can create executable jar file"));
                f.setSize(500,500);
                f.setVisible(true);
            }
            
        }

        Manifest.mf

        Main-class:JarDemo (press enter)


        javac JarDemo.java

        JarDemo.class
        JarDemo$1.class

        jar -cvfm demo8.jar manifest.mf JarDemo.class JarDemo$1.class

        java -jar demo8.jar

        even we can run jar file by double clicking..


        Howmany ways to run java programm.

        1, we can run a java programm in following ways.

        1,
        From command prompt, we can run .class file with java command
        eg.
        java JarDemo

        2,
        from command prompt we can run .jar file with java command.
        eg.
        java -jar demo.jar

        3,
        by double clicking a jar file.

        4. by double clicking a batch file.

        Batch file.

        a batch file contains a group of commands,whenever we double click a batch file then all commands will be executed one by one in the sequence.

      in abc.bat 
      java -cp c:durga_classes JarDemo

      Difference between classpath and path..
      classpath..
      1,
      classpath describe the location,where required .class files are available.
      java compiler and jvm will use classpath to locate required class file.

      if we are not setting class path then our programm may not compile and may not run.

      PATH.
      path describe the location,where required binary executables are available.
      if we are not setting path then javac and java command won't work.

      set path= c:\Program Files\Java\jdk\bin


      Difference between jdk, jre, jvm

      jdk(java development kit)

      jdk provide environment to develope and run java application.
      
      jre(java runtime environment)

      provide an environment to run java application.

      jvm(java virtual machine)
      jvm is responsible to run java programm line by line,hence it is an interpreter.

      jdk = jre + development tools.

      jre= jvm + library classes.

      JVM is the part of jre, where as jre is the part of jdk.

      note.
      on the developer machine, we have to install jdk, whereas on the client machine, we have to install jre.

      Difference between java, javaw, javaws

      1.
      java command:
      we can use java command to run a java class file, where sop will be executed and corresponding output will be displayed to the console.

      2,
      javaw command
      java without console output.
      we can use javaw command to run a java class file,where sop will be executed but the corresponding output won't be displayed to the console.

      In general,we can use javaw command to run GUI based application.


      3,
      javaws command.(java web start utility)

      we can use javaws to download a java application from the web and to start its execution.
      we can use javaws command as follows.

      javaws jsplurl.com
      it downloads the application from the specified url and starts execution.

      The main advantage in this approach is every end user will get updated version and enhancement we become easy because of centralize control.








        */
    }
    
}
