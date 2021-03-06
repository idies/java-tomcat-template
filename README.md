# java-tomcat-template

When you deploy this project in Tomcat, you should be able to go to `http://localhost:8080/java-tomcat-template/hello` and see the message: "Hello, IDIES".

## Initial setup

Copy configuration files from `conf.examples` to `conf` and edit them as needed.

## Common tasks

`ant dist` - resolves all dependencies and builds the project. War file is placed in `dist`. 

`ant clean` - cleans the `build` and `dist` directories. You may need to do it before running `ant dist`.

`ant all` (default) - clean + dist

## Eclipse setup

- Start the "Dynamic Web Project" wizard.
- Enter the project name, uncheck "Use default location" and enter your repository location instead. **Do not** click "Finish" yet! Go step by step.
- Set "Default output folder" to `build\WEB-INF\classes`.
- Set "Content directory" to `build`. Change "Context root" as needed.
- Now click "Finish".
- Add jars from `lib`, `lib.local` and `lib.catalina` to your Java Build Path. N.B.: `lib.local` contains the libraries that are not downloaded automatically by Ivy and should go into Git.
