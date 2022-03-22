# SOLAR SYSTEM SIZING
This alogirithm is for the sizing of a solar system with the aim coming up with the outcomes which can then helps us design and install a solar system for powering our loads depending on our needs.
To size a solar system for supplying a set of loads, we need to know the total power of each load and their independent hour of autonomy not forgeting the number of each type of load. This data helps us size a suitable solar system using our algorithm. But what more to our algorithm is that there are four different ways in which data can be inputed into our algorithm for sizing your system. 
- First: You can enter the total energy per day and the number of hours of autonomy and if the number of hours of autonomy is not entered, the system uses a default number of autonomy of 8 hours.
- Second: You can enter the total power of the system and the number of hours of autonomy. If the user doesn't enter the number of hours of autonomy, the system choses the default number of hours of autonomy of 8 hours.
- Third: Here you can enter the powers of each type load, their numbers and hours of autonomy each. The default number of hours of autonomy is 8 hours. If you have a set of identical loads with the same power rating but you want to have different hours of autonomy, you should enter them as different kind of loads. The same goes for if the loads have different power rating.
- Fourth: Here you can enter the power of each load and their repective number but there is a global number of hours autonomy for all the loads which by default it is 8 hours but can be modified by the user. 
At the end of the sizing of your system using our algorithm, the user will know the panel, inverter, battery, charge controller that he/she have to use with enough detail on each of them and how they are to be connected including the array connections of both the panels and batteries.
Our algorithm consist of the following.

## Sizing the total power of the system
- Finding the total maximum power of the system.

## Sizing the energy consumption of the house with a specific hour of autonomy
- Finding the total energy needed per day and the number off hours of autonomy per day of the system.

## Sizing of the Solar panel
Here you need to find the;
- Power of the panel needed.
- Voltage of the panel needed.
- Nominal voltage of the panel needed.
- Numbers of Panels needed.
- Posible array connection of panels (not forgetting a default array connection of panels that will depend on our algorithm).

## Sizing of the Inverter
In sizing the inverter needed for the systemm you need to find the following;
- Inverter output rated Watt (in W).
- Inverter input rated DC Voltage (usually called the system voltage).
- Find the total number of inverters only in case of very large systems (in this casem the connection of inverters is supposed to be considered carefully).

## Sizing of the Solar Battery
In the sizing of the battery needed for the system, you need to find the folllowing;
- Find first the voltage of the required battery.
- Find the list of possible batteries that can be used to size the system.
- Find the ampereHour of the chosedn battery that will be used to size the system.
- Find the number desired number of batteries.
- Determine array connection of batteries.

## Sizing of the Solar Charge Controller
In the sizing of the charge controller, the following should be known;
- Battery outlet of the charge controller should have the same rating as that of the inverter DC input.
- Max input voltage of the solar charge controller in the panel outlet.
- Range of acceptable DC input current (max and min input current from panels) in the panel outlet.
- **_Note:_** We need to note that then last two point will always depend on the array connection of pannels.