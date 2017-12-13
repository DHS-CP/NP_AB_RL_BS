

===== README.txt ========

Assignment: PLTW 2.1.4
Date: December 06, 2017
Team Members: Bharath Senthilkumar, Nikolai Peram, Aakash Balaji, Rishabh Lenka

Description:

This assignment was a lesson in how to modify a navigation drawer to suit our app's needs.

Team member roles in assignment: 

Bharath: Worked on code and documentation.
Nikolai: Worked on code and documentation.
Aakash: Worked on code and documentation.
Rishabh: Worked on code and documentation.

Key Lessons learned:
In Part 1, we  learned about only the portions of this code that are relevant to the Navigation Drawer. For Part 2, we needed to add fragments to our app, allowing for modular design that will make it easy to port to tablets or other devices at a later time. We also need to create a home for the Fragment in our layout, as well as create the Fragments in ApplicantActivity and write code to give the app code logic for how to switch between them. Part 3:  As a responsible member of the cyber community, we should never reveal too much personal information about ourselves, such as your full name and address, Social Security number, and credit card numbers unless you are absolutely certain the website or application is trusted. We need to sign a document. 


Conclusion Questions


36. Why is a navigation drawer a good fit for the College App?

    The navigation drawer is a good fit for the College App because it is a panel that displays the app’s main navigation options on the left edge of the screen. It is hidden most of the time, but is revealed when the user swipes a finger from the left edge of the screen or, while at the top level of the app, the user touches the app icon in the action bar.

37. Use the Internet to find at least three non-official sources of information that you could use to help you work with navigation drawers as an app developer. Describe your findings.

 One use for the navigation drawer is when the user selects an item in the drawer's list, the system calls onItemClick() on the OnItemClickListener given to setOnItemClickListener(). Another use for the navigation drawer is basically to create a menu sidebar, for example in proto.io, our app design has a sidebar that can navigate you to a different page. Another use for the navigation drawer is to just keep your design organized and easy to locate, so it can be easy access for the people.
https://developer.android.com/training/implementing-navigation/nav-drawer.html describes how to implement basic navigation drawers and how they're used. It also has information on how to initialize a drawer list.
In addition, the https://medium.com/@janishar.ali/navigation-drawer-android-example-8dfe38c66f59 has information on how to implement a specific navigation drawer and a cool little example of when it's used.
Another non-official source would be http://www.arjunsk.com/android/how-to-use-fragment-layout-and-scroll-layout-in-android-studio/.

===== README.txt ========

Assignment: PLTW 2.1.5
Date: 12/12/17

Description:

This assignment was a lesson in abstract classes, text fields and adding user input to the college app. Through these, we can store data about the college applicant, such as their family or date-of-birth. Abstract methods are methods that are not not implemented but still declared. These classes prevent objects from being instantiated, and while not required, they inherit methods from other classes and ensure commonality between the classes, making it easier and simple to code.

For example, if many classes require the same methods, but differ in how they use those methods, then an abstract superclass can be used to create the methods, and the subclasses can modify them to fit their own needs.

Team member roles in assignment: (Who did what)
Rishabh Lenka: Coding and Documentation
Bharath Senthilkumar: Coding
Nikolai Peram: Coding
Aakash Balaji: Coding

Key Lessons learned:
Summarize what you think important teaching points from the lesson were.

I think the most important lesson was the use of abstract classes and methods to inherit from other classes and create commonalities between similar classes and methods. Another important lesson is Hungarian naming. In this naming convention, mnemonics are created using lowercase letters in the front of the variable name; these are used to indicate the type and purpose of the variable, making it easier for programmers to code.

Conclusion Questions

Answer the two conclusion questions from 2.1.5

Guardian and Sibling classes should inherit from FamilyMember because these classes share similar methods with each other and can be derived from the FamilyMember class. In addition, guardians and sibling are types of family members, so they should all be kept in a neat and organized layout. By putting them under FamilyMember, coding becomes easier and less redundant.

We do not need to instantiate FamilyMember because it becomes an abstract class. Because of this, it no longer instantiates objects and can be used as a superclass for multiple classes that share similar methods. This allows different classes to be grouped together without creating any errors and makes coding neater and easier.



