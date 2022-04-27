# Assignment5
Design patterns planned to implmement:
Requirement changes and justification
The combat requirement was changed to not include the use of consumables. I believe consumables do not fit in the theming of the game which is to musically battle your way through hell.

The leveling up requirement was changed to not have a selection of skills to level up but rather have a set path of skills through which your character will progress.

Builder design pattern was used to create the player object. This was chosen because the player is a complex object made up of various different parts that aren’t all necessary. As such it is convenient to have a builder handling the creation of the player so that a ton of constructors or super long method inputs aren’t needed.
This design pattern satisfies the requirement of choosing a class for your character
This design pattern satisfies the requirement of choosing a type for your character.
8. This design pattern satisfies the requirement of the characters minimum stats.
9. This design pattern satisfies the pattern of adding skills when leveling up

10. Factory design patterns is used to create enemies. This was chosen because the enemies will all be similar with small differences between enemy types.
3.This design pattern satisfies the requirement of all enemies getting harder as you progress(This mediator pattern also contributes to this)

Mediatory design pattern will be used to conduct the battle scenarios. This is because battles must take place in a synchronized fashion and the mediator will ensure that. The mediator design pattern is also used to conduct the traversal of floors and levels in the game
3.This design pattern satisfies the requirement of all enemies getting harder as you progress(This factory pattern also contributes to this)
4. This design pattern satisfies the requirement of the game running on cycles
5. This design pattern satisfies the requirement of each floor(set of floor levels) having a modifier on it.
6. This design pattern satisfies the requirement for combat to take place in a turn based fashion. 
7. This design pattern satisfies the requirement of leveling up.
9. This design pattern satisfies the pattern of adding skills when leveling up

Running gradle run will cause a simulation of the game to take place.
In this game you are on a mission to reclaim your soul that you lost to the devil
in a fiddle duel. You must battle the denizens of hell in musical competitions.
There are a variety of classes races and skills that will be randomly chosen for you.
Someday I would like to expand upon this game, this was enjoyable to work on.