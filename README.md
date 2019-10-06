# Code-Challenge

Developmed using Eclipse IDE 2019-03 (4.11.0)

Write a program that receives a string of commands and will output the robot's distance from it's starting point.  This distance will be the minimum amount of units the robot will need to traverse in order to get back to it's starting point. The robot can only turn 90 degrees at a time, so it cannot go directly back home, it must go in north, south, east, west directions.

### Available commands:
* `F` - move forward 1 unit
* `B` - move backward 1 unit
* `R` - turn right 90 degrees
* `L` - turn left 90 degrees

When prompted to enter commands input a string of comma-separated commands eg `F1,R1,B2,L1,B3`
Program will return the minimum distance needed to travese back to it's starting point. I have approached this problem by visuallizing that the robot moves from the origin (0,0) on an x and y axis grid. Without the specification of which direction the robot is facing, I have assumed North for it's initialization where turning 90degrees left or right can be calculated. I have used counters to sum up the distance traversed from the starting point.
