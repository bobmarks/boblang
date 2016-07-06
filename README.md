BOB LANG
========

This little Java UI application was created to aid the use of learning a language (French).  

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

The elements are as follows: -

* `<language>` - top level element with `name` attribute (e.g. `french`) and a list
   of special characters which can be access via the UI.  This contains one or more  ...
* `<course>` - contains a `name` attribute e.g. `Level 1`.  These contains one or more  ...
* `<lesson>` - contains a `name` attribute which could be each week of the course (e.g. `Week `).  
  These contains one or more  ...
* `<topic>` - contains `name` attribute describe topic of learning e.g. 
  `Conversation (Introducing yourself)`.  There could be 3 or 4 of these for each lesson.  
  These contains one or more  ...
* `<item>` - contains `q` and `a` (question and answer) attributes.  

The application reads this XML and provides the user to quickly test what they learned. 




INSTALLATION
------------




### CODE

If you are interested in developing this application I recommmend having both 
GIT, Eclipse and Maven installed.


CONTACT
-------

Any questions email the author (Bob Marks) at `marksie531@gmail.com
