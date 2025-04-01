# ZOMBALL
## Group 16
BJ Anderson <br>
Owen Giles <br>
Praneet Komandur <br>
Jonathan Rodriguez <br>
Danny Rospierski <br>
<br>
**Date: 17-02-2025**
<br>

![Zomball concept art](https://github.com/UTDClassroomOrg/courseproject-cse3354-006-s25-cse3354-006-s25_group16/blob/main/zomball_concept_art.jpeg)

# 2. Summary

ZOMBALL is a top-down 2D infinite zombie survival shooter game developed in Java using the Greenfoot framework. The game features an infinite-generating background, upgradable weapons, and powerups like health and ammo packs, providing players with a fast-paced and engaging experience. The primary goal is simple: survive as long as possible while defeating as many zombies as you can.

The project will be developed using an Agile methodology, with milestones divided into two phases: core gameplay implementation and powerups and upgrades, and final polish. Our team of five members will handle specific roles: two developers for game logic, one for graphics and animations, one for sound and powerups, and one dedicated to testing and quality assurance. Potential risks, such as performance optimization for infinite scrolling and balancing gameplay mechanics, have been identified, and mitigation strategies are in place.

The expected outcome is a fully functional, polished game that demonstrates strong software engineering practices, including version control with Git and efficient resource management. ZOMBALL will not only provide entertainment but also serve as a portfolio piece showcasing our ability to design, develop, and deliver a complete software product using Greenfoot.

# 3. Purpose
### a. Relevance or importance of problem

ZOMBALL serves multiple different purposes. The most important of which is to give the player a fun, deep, and repeatable gameplay experience. In a day and age where game developers seek to take advantage of their players and leech money out of them, ZOMBALL offers a healthier alternative. It presents the player with the ability to have fun without having to spend countless hours or dollars to achieve it.

### b. Background Information to Educate the Reader

Top-down shooter games have been a popular genre for decades, with classics like Gauntlet and Hotline Miami setting the standard for fast-paced, action-packed gameplay. These games often emphasize player skill, resource management, and replayability. Modern indie games like Vampire Survivors have demonstrated the appeal of infinite survival mechanics, where players strive to last as long as possible against increasingly difficult odds. ZOMBALL builds on these concepts while introducing its own unique twist with upgradable weapons and powerups.

### c. Previous Related Work by Others—Literature Review with Credible Sources

Several studies and projects have explored the design and development of 2D games, particularly in the survival and shooter genres. For example:

Game Design Principles: Research by Schell (2008) in The Art of Game Design highlights the importance of balancing challenge and reward to keep players engaged.

Infinite Gameplay Mechanics: Games like Geometry Dash and Vampire Survivors have successfully implemented infinite gameplay loops, proving their popularity among players.

Java Game Development: The use of Java and frameworks like Greenfoot has been well-documented in educational contexts, such as Kölling (2010) in Introduction to Programming with Greenfoot, which demonstrates the framework’s suitability for 2D game development.

These works provide a foundation for understanding the design and technical challenges of creating a game like ZOMBALL.

### d. Detailed Problem Description, as You Now Understand It

The core problem ZOMBALL aims to solve is creating a fun, replayable, and technically sound game within the constraints of a small team and limited resources. Key challenges include:

Designing an infinite-scrolling mechanic that feels seamless and performs well.

Implementing zombie AI that provides a balanced challenge without overwhelming the player.

Creating a progression system through weapon upgrades and powerups that keeps players motivated.

Ensuring the game is optimized for performance, even with a high number of entities on screen.

# 4. Objectives
The primary objective of the ZOMBALL project is to develop a top-down 2D infinite zombie survival shooter game using Java and the Greenfoot framework. The scope of work includes the following:
### i. Design Specifications in Specific, Quantitative Terms

Gameplay Mechanics: Implement an infinite-scrolling background with smooth player movement and zombie AI behavior. The game will support at least 3 types of weapons (e.g., pistol, shotgun, machine gun) with upgradable stats (damage, fire rate, ammo capacity).

Powerups: Include health packs, ammo packs, and temporary powerups (e.g., invincibility, speed boost) that spawn randomly during gameplay.

Performance: Ensure the game runs at a consistent 60 FPS on standard systems, even with a high number of zombies on screen.

Scoring System: Track and display a player’s score based on zombies defeated and survival time, with scores saved locally for high-score tracking.

User Interface: Develop a clean and intuitive UI, including a main menu, pause screen, and in-game HUD displaying health, ammo, and score.

### ii. Critical Design Issues, Constraints, and Limitations

Performance Optimization: Managing the infinite-scrolling background and rendering a large number of zombies without frame drops will be a key challenge. Techniques like object pooling and efficient collision detection will be critical.

Game Balance: Ensuring the game is challenging but fair requires careful tuning of zombie spawn rates, weapon stats, and powerup frequency.

Time Constraints: With a fixed development timeline, prioritization of features will be necessary. Core gameplay mechanics will take precedence over additional features like multiplayer support.

Greenfoot Limitations: While Greenfoot is beginner-friendly, its limitations in handling complex graphics and physics may require creative workarounds for certain features.

Testing and Debugging: Ensuring the game is bug-free and runs smoothly across different systems will require rigorous testing, particularly for edge cases like high zombie counts or rapid player inputs.

# 5. Approach

### i) What are the steps?
Core Game Development
Core Mechanics: Implement player movement, shooting, zombie AI, collision detection, and damage mechanics.


Game Features: Add infinite scrolling, weapon upgrades, powerups, and difficulty scaling.


Graphics & Sound: Design 2D sprites, animations, and sound effects.


Optimization & Testing: Ensure smooth performance, playtest for balance, and fix bugs.


Final Polish: Refine UI, add score tracking, and package for deployment.


### ii) How will you generate solution concepts?

Conduct brainstorming sessions within the team to discuss possible gameplay mechanics and features.
Research similar top-down survival shooter games to identify effective mechanics.
Prototype small mechanics in Greenfoot before full integration to test feasibility.

### iii) How will you analyze the performance of your solution?

Measure frame rate and memory usage to ensure smooth gameplay.
Conduct multiple playtesting sessions to gather feedback on difficulty and mechanics.
Use debugging tools in Greenfoot to track and resolve performance issues.

### iv) What are the alternatives?

Alternative Game Frameworks: If Greenfoot has limitations, we could consider using a different Java-based framework (e.g., LibGDX).
Different Movement Mechanics: If infinite scrolling causes performance issues, we could switch to a large fixed-size map with wave-based spawning.
AI Simplification: If zombie pathfinding is too complex, we could implement a simpler "follow-player" logic instead of advanced navigation.

### v) How will you decide on the best alternative?

Evaluate alternatives based on feasibility, performance impact, and development time.
Prioritize solutions that align with our project timeline and available resources.
If a major issue arises, discuss as a team and revise the proposal with the best alternative approach.

# 6. Project Management
### i) Project duration
The ZOMBALL project will span approximately 12 weeks, following an Agile development methodology. The project consists of three major iterations, each focusing on specific aspects of game development:<br>
-    Iteration 1: Core Gameplay Implementation (Weeks 1–6)<br>
-    Iteration 2: Powerups, Upgrades, and Features (Weeks 7–10)<br>
-    Iteration 3: Final Polish and Optimization (Weeks 11–12)
 	
### ii) Each milestone is to be labeled with a title (Iteration 1, Iteration 2, Iteration 3)
-    Group Sign-up Sheet (02/05/2025): <br>-    Team registration<br>
-    Project Proposal (02/23/2025): <br>-    Submit project scope, objectives, and initial design concepts<br>
-    Iteration 1 (03/24/2025): <br>-    Implement core gameplay mechanics (player movement, shooting, zombie movement, collision detection)<br>
-    Iteration 1 Final Documents (3/30/2025)<br>
-    Iteration 2 (4/20/2025): <br>-    Implement powerups, weapon upgrades, sound effects, and difficulty scaling<br>
-    Iteration 2 Final Documents (4/27/2025)<br>
-    Iteration 2 Demo (TBD): <br>-    Sign up sheet open for live demonstration!<br>
 	
### iii & iv) Schedule all tasks; Each task is to be labeled with a title and person or persons assigned to the task.
#### Iteration 1
-    Player movement and shooting: BJ (2/7)<br>
-    Develop zombie behavior: BJ (2/14)<br>-    Dependency: Player Movement<br>
-    Implement collision detection & damage system: BJ (2/21)<br>
#### Iteration 2
-    Implement powerups: BJ, Owen (2/28)<br>-    Dependency: Player Mechanics<br>
-    Create weapon upgrade system: BJ, Jonathan, Praneet (3/7)<br>-    Dependency: Player shooting<br>
-    Develope sound effects and background music: BJ, Danny (3/14)<br>-    Dependency: Basic gameplay mechanics<br>
-    Balance enemy difficulty scaling: BJ, Jonathan, Owen (3/21)<br>-    Dependency: Zombie movement<br>
-    Refine UI: BJ, Danny, Praneet (3/28)<br>
-    Conduct playtesting and bug fixes: Entire Team (4/4)<br>-    Dependency: All prior tasks completed<br>

 	
### v) Link the tasks that are dependent on the completion of a previous task.

-    Zombie movement requires player movement to be functional
-    Weapon upgrades and powerups require player mechanics to be implemented first
-    Final optimization and UI enhancements depend on the completion of all core gameplay elements<br>
 	
### vi) Continue to update your schedule throughout your project. This tool is important for organizing and viewing the progress of your project

-    Progress Reports: Weekly reports to document progress, challenges, and solutions
-    Iteration 1 & 2 Demo: Teams must be prepared to showcase progress during scheduled demonstrations
-    Final Presentation: A live demonstration of the completed game, mandatory for all team members
-    Final Submission: Includes the completed game, final documentation, and a fully functional repository on GitHub<br>

# 7. Deliverables
The ZOMBALL project will deliver a fully functional and polished top-down 2D infinite zombie survival shooter game developed in Java using the Greenfoot framework. Below is a detailed breakdown of the deliverables and their expected timelines:
Iteration 1: Core Gameplay Implementation

Player Controls: Implement smooth player movement (up, down, left, right) and shooting mechanics.

Zombie AI: Develop basic zombie behavior, including pathfinding and attacking the player.

Infinite Scrolling: Create a seamless infinite-scrolling background to enhance the survival experience.

Basic UI: Design a heads-up display (HUD) showing health, ammo, and score.

Iteration 2: Polish and Final Additions

Weapon System: Implement at least 3 weapon types (e.g., pistol, shotgun, machine gun) with upgradable stats (damage, fire rate, ammo capacity).

Powerups: Add powerups like health packs, ammo packs, and temporary boosts (e.g., invincibility, speed).

Scoring System: Track and display the player’s score based on zombies defeated and survival time.

Main Menu and Pause Screen: Develop a user-friendly main menu and pause screen with options to start, restart, and quit the game.

Sound Effects and Music: Add sound effects for shooting, zombie attacks, and powerups, along with background music to enhance immersion.

Testing and Debugging: Conduct rigorous testing to ensure the game is free of bugs and performs well across different systems.

Final Build: Deliver a fully functional, optimized, and polished version of ZOMBALL, ready for distribution.

Additional Deliverables

Documentation: Provide a comprehensive project report detailing the design, development process, and challenges faced.

Source Code: Submit clean, well-commented source code with proper version control history (using Git).

Demonstration: Create a short gameplay demo showcasing the game’s features and mechanics.


# 8. Team Qualifications
## BJ Anderson
BJ Anderson has experience teaching programming and game development to children as a Lead Instructor at the UTD Center for Computer Science Education and Outreach. His responsibilities include creating programming projects prior, explaining game development concepts, and helping students debug their own programs. In addition, during his “Introduction to Computer Science and Software Engineering” course (CS 1200) his team designed a game that scored 215/100 points. BJ’s contributions were an innovative UI for the start menu and logic for a “pause” button (which many other groups failed to implement properly) each receiving 50 (out of the 25 possible) points. BJ has developed games in Python, Java, JavaScript, C++, and Rust for over 5 years.

## Owen Giles
Owen Giles has been working at Hewlett-Packard Enterprise for over 2 years. Since his senior year in high school, he has been working on projects that require an understanding of low level system operations and knowledge of the C programming language. He brings on-job experience of working directly with a team to achieve customer goals in a timely manner as well as a knack for out of the box solutions to architectural problems. Prior to his job at HPE, he was a competitive programmer for his high school, specializing in Java. He has personal projects dedicated to smaller games and scripts that he develops in his free time, some of which are very similar to ZOMBALL in its construction.

## Praneet Komandur
Praneet Komandur comes with a strong background in game development and Java programming, along with experience working on both solo and group projects. With expertise in building software solutions, such as AI behavior and game rules, Praneet is well-positioned to contribute to the core gameplay of ZOMBALL. As an incoming cybersecurity intern at Dow Jones, he brings a keen understanding of security standards, ensuring the integrity of the game and its supporting systems. Additionally, Praneet’s focus on quality assurance and testing guarantees that the game will provide a well-balanced and polished experience for players.

## Jonathan Rodriguez
Jonathan brings 5 years of experience in Java programming, making him a strong asset for the development of ZOMBALL. His expertise includes creating mods for Minecraft Forge, where he honed his skills in game logic, object-oriented programming, and problem-solving in a gaming context. Additionally, Jonathan has 1 year of experience in Unity game development, giving him a solid understanding of game design principles, physics, and user interaction. His diverse background in both Java and game development positions him as a key contributor to implementing core gameplay mechanics, optimizing performance, and ensuring a seamless player experience in ZOMBALL.

## Danny Rospierski
Danny Rospierski brings a strong foundation in software development, with proficiency in Java, C, and C++, complemented by hands-on experience in database management and user interface design. As a Computer Science student at the University of Texas at Dallas, he has applied his technical expertise in both academic and professional settings. During his internship with the Houston Police Department’s Museum Academy, Danny managed databases, classified and documented artifacts, and collaborated with a team to meet project milestones. Additionally, his role at Signature Sudz honed his problem-solving and organizational skills as he managed inventory, processed transactions, and engaged with customers. His experience balancing technical and customer-facing responsibilities demonstrates his adaptability and teamwork—qualities that make him a valuable candidate for software development roles.


# Appendix A: Team Member Resumes
## BJ Anderson Resume
[BJ's Resume](https://github.com/UTDClassroomOrg/courseproject-cse3354-006-s25-cse3354-006-s25_group16/tree/main/resumes/Anderson_BJ_Resume.pdf)

## Owen Giles Resume
[Owen's Resume](https://github.com/UTDClassroomOrg/courseproject-cse3354-006-s25-cse3354-006-s25_group16/tree/main/resumes/Gile_Owen_Resume.docx)

## Praneet Komandur Resume
[Praneet Resume](https://github.com/UTDClassroomOrg/courseproject-cse3354-006-s25-cse3354-006-s25_group16/tree/main/resumes/Komandur_Praneet_Resume.pdf)

## Jonathan Rodriguez Resume
[Jonathan's Resume](https://github.com/UTDClassroomOrg/courseproject-cse3354-006-s25-cse3354-006-s25_group16/tree/main/resumes/Rodriguez_Jonathan_Resume.pdf.docx)

## Danny Rospierski Resume
[Danny's Resume](https://github.com/UTDClassroomOrg/courseproject-cse3354-006-s25-cse3354-006-s25_group16/tree/main/resumes/Rospierski_Danny_Resume.pdf)
