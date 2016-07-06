BOB LANG
========

This little Java UI application was created to help me learn French and can be used to help learn any 
language.  

![Screenshot of BobLang](https://github.com/bobmarks/boblang/raw/master/images/screenshot.png 
"Screenshot of BobLang")

It is programmed using the Java Swing library and reads an `lang.xml` as input.  The syntax of the 
file as follows: -

```xml
<?xml version="1.0" encoding="utf-8"?>
 
<language name="french" specialchars="àâçéèêëîôùû">
    <course name="Level 1">
        <lesson name="Week 1">
            <topic name="Conversation (Introducing yourself)">
                <item a="Bonjour Monsieur" q="Hello (to a man)"/>
                <item a="Je m'appelle" q="I am called ..."/>
                ...
            </topic>
            ...
        </lesson>
        ...
    </course>
    ...
</langauge>
```

The elements are: -

* `<language>` - top level element with `name` attribute (e.g. `french`) and a list
   of special characters which can be access via the UI.  This contains one or more  ...
* `<course>` - contains a `name` attribute e.g. `Level 1`.  These contain one or more  ...
* `<lesson>` - contains a `name` attribute which could be each week of the course (e.g. `Week `).  
  These contain one or more  ...
* `<topic>` - contains `name` attribute describe topic of learning e.g. 
  `Conversation (Introducing yourself)`.  There could be 3 or 4 of these for each lesson.  
  These contains one or more  ...
* `<item>` - contains `q` and `a` (question and answer) attributes.  

The application reads this XML and provides the user to quickly test what they learned.


GET STARTED
-----------

If you are only interested in running BobLang (and not developing it) then simply download 
the latest release of `boblang.jar` to a folder on your computer. 

[BobLang GitHub Releases](https://github.com/bobmarks/boblang/releases)

Ensure [Java](https://java.com/download) is installed and run the file as follows: -

```bash
java -jar boblang.jar
```

**NOTE:** BobLang won't work unless there is a valid `lang.xml` at the same location.  
You can either create your own or use the `lang.xml` which is included with boblang.  
A GitHub link to the latest version is available   
[here](https://raw.githubusercontent.com/bobmarks/boblang/master/lang.xml).

DEVELOP
-------

Ensure you have the following: -

1. [GIT](https://git-scm.com/downloads) - used for downloading and contributing new source
2. [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) - is 
  required to build the BobLang project. and Maven are installed and setup properly.  
3. [Maven](https://maven.apache.org/download.cgi) - required for dependancies.

Once these are downloaded and properly installed you can download the code via a git clone, 
perform a maven build and run the Java _self-contained-jar_ `boblang.jar` which maven builds in the
`target` folder.

1. GIT Clone 

```bash
cd workspace           # folder of your choice
git clone https://github.com/bobmarks/boblang.git
```
    
2. Maven Build 

```bash
mvn install
java -jar target/boblang.jar
```

CONTACT
-------

Any questions email the author (Bob Marks) at marksie531@gmail.com
