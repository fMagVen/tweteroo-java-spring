# Tweteroo Java :dodo: :coffee:
## Twitter clone made on a 2 week crash course on Java + APIs with Spring
### :computer: Tech used
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
## :technologist: Usage
Make sure <a href="https://openjdk.org/install/">JDK</a> is installed

- Clone this repo
- On vscode also make sure <a href="https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack">Extension Pack for Java</a> and <a href="https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-boot-dev-pack">Spring Boot Extension Pack</a> are installed
- Run the main method on ApiApplication.java

## :door: Endpoints

#### ```POST /api/auth/sign-up```

Add new user. Send body JSON with the following:

{

	username: string, chosen user name
	avatar: url of picture to be used as avatar

}

#### ```POST /api/tweets```

Post a message. Send body JSON with the following:

{

	username: string, your user name
	tweet: string, your message to the world!

}

#### ```GET /api/tweets?page=0```

Gets 5 messages. Change query string parameter ```page``` to a natural integer to get them by pagination. E.g. 1 to tweets 6 to 10, 2 to tweets 11 to 15 and so on.

#### ```GET /api/tweets/{username}```

Gets all messages by a given user.

### :man_technologist: Author
<p>Made with care by</p>

<a href="https://github.com/fMagVen"><img  style="border-radius: 50%;"  src="https://avatars.githubusercontent.com/u/78576546?v=4"  width="100px;"  alt="Felipe Ventura"/></a>

[![Gmail Badge](https://img.shields.io/badge/-fmagven93@gmail.com-c14438?style=flat&logo=Gmail&logoColor=white&link=mailto:fmagven93@gmail.com)](mailto:fmagven93@gmail.com)

[![Linkedin Badge](https://img.shields.io/badge/-Felipe-Ventura?style=flat&logo=Linkedin&logoColor=white&color=blue&link=https://www.linkedin.com/in/fmagven/)](https://www.linkedin.com/in/fmagven/)