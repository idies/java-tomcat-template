# java-tomcat-template

Copy configuration files from `conf/examples` to `conf`.

## Common tasks

*This is subject to change...*

`ant dist` [default] - resolves all dependencies and builds the project. War file is placed in `dist`. 

`ant clean` - cleans the `build` and `dist` directories. You may need to do it before running `ant dist`.


## Eclipse setup

- Start the "Dynamic Web Project" wizard.
- Enter the project name, uncheck "Use default location" and enter your repository location instead. **Do not** click "Finish" yet! Go step by step.
- Set "Default output folder" to `build\WEB-INF\classes`.
- Set "Content directory" to `web`. Change "Context root" as needed.
- Now click "Finish".
- Add jars from `lib`, `lib.local` and `lib.catalina` to your Java Build Path. 
