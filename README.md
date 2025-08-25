# Labyrinth Game Project 🎮

  ![GitHub Total Commits](https://img.shields.io/github/commit-activity/t/UmitOzteker/Labyrinth_Game_Project) ![GitHub Last Commit](https://img.shields.io/github/last-commit/UmitOzteker/Labyrinth_Game_Project) ![GitHub Issues](https://img.shields.io/github/issues/UmitOzteker/Labyrinth_Game_Project)

Welcome to the **Labyrinth Game Project**\! This repository hosts a command-line-based labyrinth game meticulously crafted in **Java**. The game challenges players to navigate a procedurally generated maze, find their way through its intricate paths, and locate the exit. This project is a fantastic example for those interested in **game development fundamentals**, **object-oriented programming (OOP)**, and the implementation of **procedural generation algorithms**.

## About The Project 📜

This project goes beyond a simple game; it serves as a robust demonstration of core software development principles. At its heart, the game uses a **depth-first search (DFS)** based algorithm to generate unique and solvable mazes for every playthrough. The design is modular, with separate classes handling the maze's structure, the player's movements, and the game's overall logic, making the code easy to understand, maintain, and extend.

The current version provides a complete and playable game experience right from the command line. While it's a finished product in its current form, there's ample room for future enhancements, such as a graphical user interface (GUI), new game modes, or more complex algorithms.

## Features ✨

  * **Procedural Maze Generation**: The game generates a new labyrinth for each session, ensuring that no two games are the same. This randomness provides endless replayability.
  * **Intuitive Player Navigation**: Players can easily control their character's movement through the maze using simple keyboard inputs (`W`, `A`, `S`, `D`), with the game handling collision detection and valid moves.
  * **Dynamic Display**: The maze and player's position are dynamically rendered in the console, providing a real-time visual representation of the game state.
  * **Modular OOP Design**: The project is a great example of applying **Object-Oriented Programming** principles. Key components like `Maze`, `Player`, and `GameEngine` are encapsulated in their own classes, promoting clean and reusable code.
  * **Algorithm Demonstration**: The underlying maze generation algorithm is a perfect case study for understanding how complex structures can be created from simple rules.
  * **Extensibility**: The clean architecture allows developers to easily add new features, such as new items, traps, or a timer, without having to refactor the entire codebase.

-----

## Getting Started 🚀

To get a local copy of this project up and running, you'll need a **Java Development Kit (JDK)** installed on your machine.

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/UmitOzteker/Labyrinth_Game_Project.git
    ```

2.  **Navigate to the project directory:**

    ```bash
    cd Labyrinth_Game_Project
    ```

3.  **Compile the source code:**
    Use `javac` to compile the Java source files.

    ```bash
    javac src/*.java -d bin
    ```

4.  **Run the game:**
    Execute the compiled code from the `bin` directory.

    ```bash
    java -cp bin com.umitozteker.LabyrinthGame
    ```

-----

## Contributing 🤝

Contributions are welcome\! If you have ideas for new features, optimizations, or if you find a bug, please don't hesitate to open an issue or submit a pull request. We are always looking for ways to improve the project.

-----

## License 📜

This project is currently unlicensed. Please contact the repository owner for more information.

## Contact 📬

For questions, support, or feedback, you can reach out to Umit Ozteker via GitHub issues or social media.
