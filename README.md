# ece1778-assignment1
Code for Assignment 1 in course ECE1778.

# How to Download
[Download here as a zip folder](https://github.com/shirj/ece1778-assignment1/archive/master.zip "download as zip")

# How to use run the code on your own device
After downloading the ZIP file, unpack to a folder. (Alternatively clone the repository using Git Version Control System (VCS) On the welcome screen of Android Studio, choose import project. Click yes/confirm/download if Android Studio prompts any missing dependecies/SDKs.

# What to look for
##Java code 
is in [app/src/main/java/tech/billshi/assignment1demo/MainActivity.java](../master/app/src/main/java/tech/billshi/assignment1demo/MainActivity.java)

##XML layout code
is in [app/src/main/res/layout/activity_main.xml](../master/app/src/main/res/layout/activity_main.xml)

#Other interesting files to look at
##String resource file
[app/src/main/res/values/strings.xml](../master/app/src/main/res/values/strings.xml)     
This is where all string contants are defined. The use of string resource file is very important if you expect to accomadate user of different languages, or change the wording of the application very frequently.
In the XML these are referenced as `@string/%STRING_ID%`.    
In the Java code these can be obtained by `getResources().getText(R.string.%STRING_ID%)`
##Picture (drawable) asset folder
[app/src/main/res/drawable](../master/app/src/main/res/drawable)     
Dogs picture used in the assignment goes here.    
In the XML these are referenced as `@drawable/%DRAWABLE_ID%`.    
In the Java code these can be obtained by `getResources().getText(R.string.%DRAWABLE_ID%)`
