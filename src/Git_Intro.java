public class Git_Intro {
}
/*
# Task 1 :

1. Open your IntelliJ and create new Java Project
2. Name your `git_practice1`
3. Create a class called `HelloWorld` under source
4. Now instruct git to keep track of this project folder by enabling version control to create new local repository
   1. You can do this by going to top menue `VCS` -> `Enable Version Control` and hit `Ok`
   2. `VCS` option will turn into `Git` from this point on
   3. From the `Git` option click `commit`
   4. It will open up tab on the left
      1. Select all the files you want to keep tract of
      2. Enter commit message into the box right on top of commit button
      3. andn Hit commit
   5. If it's the first time , it will ask you to enter `name and email`
      1. enter the name you desired
      2. enter the same email you used for Github.com account
   6. You will see success message on bottom left corner saying created git repository in xxx location.
   7. If you see version not supported on bottom left corner
      1. click on configure link and click on next screen.

5. Now do some more work (add some text anywhere)
   1. `git` will see what has changed from last commit till now
   2. IntelliJ will also inidicate with green bar on the left for indication
   3. Now when we are ready to save this change into git repository , we can make our second commit same way we did previously
   4. Go to top menu `Git` -> `Commit`
      1. from the left tab select the file change you wanna commit
      2. provide commit messages
      3. hit commit

##  Sharing local git repository to GitHub

1. Go to `preference` on `mac` and `File`->`Setting` on windows
2. Search for `GitHub` from the preference searchbox
3. Click on `GitHub` from the left tab search result
4. Click on `Add Account` -> `Login via Github`
   1. It will open up browser window
   2. Authorize Jetbrain
   3. Enter your credential if it's asked
   4. Authorize `Cybertek-B25` organization
   5. Enter Okta credentials if asked
   6. Now you will see success message saying its connected
   7. Now you can directly interact with GitHub from your IntelliJ
5. Back to intelliJ and click `Ok` to save your progress
6. Make sure you committed all your changes
7. From top menu `Git` ->`GitHub` -> `Share Project On GitHub`
   1. Optionally provide description
   2. Hit `Share` button
   3. After a while it will give you success message with direct link
8. Here is what exactly happened from previous process Once you click on share button
   1. It created new Remote Repository Under your GitHub Account
   2. It created connection between your local repository on your computer and remote repository on GitHub.com
   3. It pushed all the local commits to remote repository
   4. All these steps are happening in one shot behind the scenes
   5. So we just need to do it once `Share Project on GitHub`
9. What if I have more work and i have more commits
   1. Make your changes and commit your changes
   2. DO NOT USE SHARE PROJECT ON GITHUB because it already established the connection between local and remote.
   3. All you need to do is from the top menu
      1. `Git` -> `Push`
      2. It will push your local commits to remote repository
      3. `Push` is a git term for pushing local commits to remote repository
10. Create one more class called `Practice1`
11. Observe the pop-up saying :
      - `Do you always want to add new file to git`
      - click on `Do not Ask` checkbox and click `Add`
      - This will ensure git will always keep track of new files added 
      - So you do not have to manually add. 
 */
