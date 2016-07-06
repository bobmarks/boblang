BOB LANG
========

This little Java UI application was created to help me learn French and can be used to help learn any language.  

![Screenshot of BobLang](https://github.com/bobmarks/boblang/raw/master/images/screenshot.png "Screenshot of BobLang")

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

If you are interested in developing this application I recommend having both 
GIT, Eclipse and Maven installed.

DEVELOP
-------

Ensure GIT, Java and Maven are installed and setup properly.  Then git clone, maven
build and run the Java _self-contained-jar_ `boblang.jar` which maven builds in the
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
