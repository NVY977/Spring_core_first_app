# Spring_java_first_app
The first simple web application based on the spring framework.

Music - Interface. Inside is the getSong() method.
The ClassicalMusic, PopMusic, and RockMusic classes release the Music interface.
The MusicPlayer class is responsible for playing the music of a specific or list of music.

In the main testSpring class (TestSpring), work with beans.

// Over time, I got rid of the applicationContext.xml and moved on to creating annotations.

// You can see the context file work in earlier commits:

// https://github.com/NVY977/Spring_java_first_app/pull/2/commits/5c32cfe435fb9da0348c10dd7e46284eead3bee9

// https://github.com/NVY977/Spring_java_first_app/pull/1/commits/61101aa72b6801cfa56dc2f107415df85961aa37

// In the configuration file (src/resources/applicationContext.xml), the creation of beans and their dependencies, as well as the scope of the beans.

The properties (src/resources/musicPlayer.properties) file specifies the values that we use when creating the bean.

Now bean creation will go through annotations
