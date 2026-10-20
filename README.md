

# Multiphysics Analysis of a Perforated Copper Bar (COMSOL)

A advanced multiphysics finite element method (FEM) project built in **COMSOL Multiphysics** to analyze the complex coupling between electric currents, heat transfer, and structural mechanics in a copper busbar.

## 🔬 Physics & Simulation Steps
* **Electric Currents (EC):** Applied a high electric current terminal (2 kA) to analyze electric potential distribution, current density concentrations around the perforations, and Joule heating generation.
* **Heat Transfer in Solids (HT):** Computed the steady-state and temperature distribution resulting from resistive heating, accounting for thermal boundary conditions.
* **Temperature-Dependent Resistivity:** Factored in how rising temperatures increase copper resistivity, creating a realistic electro-thermal feedback loop.


## 🛠️ Built With
* **Software:** COMSOL Multiphysics
* **Analysis Type:** Stationary 

### 1. Electric Potential Distribution
* **What you see:** How the electric potential is distributed along the length of the copper bar, with a terminal current applied which causes a continuous fall of potential from one end to the other, thus illustrating the effects of geometry and the perforations on current flow.
<img width="863" height="467" alt="LastHomework4" src="https://github.com/user-attachments/assets/f03cef71-6b1d-4289-a9f9-a62ad2733f9a" />

### 2. Current Density & Resistive Effects
* **What you see:** The magnitude of the current density across the bar; note that the current gathers at the edges of the circular perforations (with local peaks amounting to up to ~ 2.0 x 10^7 A/m²), which in turn causes localized Joule heating.

<img width="863" height="467" alt="LastHomework3" src="https://github.com/user-attachments/assets/6b4332a5-14b8-41c9-821f-dfb4409dfc61" />

### 3. Thermal Distribution (Standard Resistivity)
* **What you see:** The temperature distribution when resistive heating is occurring is such that heat builds up at the centre of the bar, reaching a maximum temperature of **~501.3 K**, the ends which are clamped remaining cooler (the ambient temperature being ~293.15 K).


<img width="848" height="467" alt="LastHomework2" src="https://github.com/user-attachments/assets/37e0227a-48a3-423a-a44f-466083acb8aa" />

### 4. Advanced Temperature-Dependent Resistivity Coupling
* **What you see:** The thermal distribution, having taken into account the realistic electro-thermal feedback loop (since an increase in temperature leads to a higher copper resistivity), shows that the maximum temperature rises further to **~633.4 K**.

<img width="848" height="467" alt="LastHomework1" src="https://github.com/user-attachments/assets/9eb4a909-9d27-4c01-9ec7-4774de49be74" />

