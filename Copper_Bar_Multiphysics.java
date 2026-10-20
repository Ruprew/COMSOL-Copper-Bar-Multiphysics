/*
 * PersonalWork.java
 */

import com.comsol.model.*;
import com.comsol.model.util.*;

/** Model exported on Oct 20 2026, 21:13 by COMSOL 6.4.0.429. */
public class PersonalWork {

  public static Model run() {
    Model model = ModelUtil.create("Model");

    model.modelPath("P:\\Facultate\\UTU\\FEM\\Lucrari");

    model.component().create("comp1", true);

    model.component("comp1").geom().create("geom1", 3);
    model.component("comp1").geom("geom1").geomRep("comsol");

    model.component("comp1").mesh().create("mesh1");
    model.component("comp1").mesh("mesh1").contribute("geom/detail", true);

    model.component("comp1").geom("geom1").create("blk1", "Block");
    model.component("comp1").geom("geom1").lengthUnit("cm");
    model.component("comp1").geom("geom1").feature("blk1").set("size", new double[]{100, 10, 50});
    model.component("comp1").geom("geom1").run("blk1");
    model.component("comp1").geom("geom1").feature("blk1").set("size", new double[]{100, 10, 0.5});
    model.component("comp1").geom("geom1").run("blk1");
    model.component("comp1").geom("geom1").create("cyl1", "Cylinder");
    model.component("comp1").geom("geom1").feature("cyl1").set("r", 3);
    model.component("comp1").geom("geom1").feature("cyl1").set("h", 0.5);
    model.component("comp1").geom("geom1").feature("cyl1").set("pos", new double[]{10, 5, 0});
    model.component("comp1").geom("geom1").run("cyl1");
    model.component("comp1").geom("geom1").create("arr1", "Array");
    model.component("comp1").geom("geom1").feature("arr1").selection("input").set("cyl1");
    model.component("comp1").geom("geom1").feature("arr1").set("fullsize", new double[]{9, 1, 1});
    model.component("comp1").geom("geom1").feature("arr1").set("displ", new double[]{10, 0, 0});
    model.component("comp1").geom("geom1").run("arr1");
    model.component("comp1").geom("geom1").create("cyl2", "Cylinder");
    model.component("comp1").geom("geom1").feature("cyl2").set("r", 3);
    model.component("comp1").geom("geom1").feature("cyl2").set("h", 0.5);
    model.component("comp1").geom("geom1").feature("cyl2").set("pos", new double[]{15, 0, 0});
    model.component("comp1").geom("geom1").run("cyl2");
    model.component("comp1").geom("geom1").create("arr2", "Array");
    model.component("comp1").geom("geom1").feature("arr2").selection("input").set("cyl2");
    model.component("comp1").geom("geom1").feature("arr2").set("fullsize", new double[]{8, 1, 1});
    model.component("comp1").geom("geom1").feature("arr2").set("displ", new double[]{10, 0, 0});
    model.component("comp1").geom("geom1").run("arr2");
    model.component("comp1").geom("geom1").create("cyl3", "Cylinder");
    model.component("comp1").geom("geom1").feature("cyl3").set("pos", new double[]{15, 10, 0});
    model.component("comp1").geom("geom1").feature("cyl3").set("r", 3);
    model.component("comp1").geom("geom1").feature("cyl3").set("h", 0.5);
    model.component("comp1").geom("geom1").run("cyl3");
    model.component("comp1").geom("geom1").create("arr3", "Array");
    model.component("comp1").geom("geom1").feature("arr3").selection("input").set("cyl3");
    model.component("comp1").geom("geom1").feature("arr3").set("fullsize", new double[]{8, 1, 1});
    model.component("comp1").geom("geom1").feature("arr3").set("displ", new double[]{10, 0, 0});
    model.component("comp1").geom("geom1").run("arr3");
    model.component("comp1").geom("geom1").create("dif1", "Difference");
    model.component("comp1").geom("geom1").feature("dif1").selection("input").set("blk1");
    model.component("comp1").geom("geom1").feature("dif1").selection("input2").all();
    model.component("comp1").geom("geom1").feature("dif1").selection("input2").set("arr1", "arr2", "arr3");
    model.component("comp1").geom("geom1").run("dif1");
    model.component("comp1").geom("geom1").run();

    model.component("comp1").material().create("mat1", "Common");
    model.component("comp1").material("mat1").propertyGroup()
         .create("Enu", "Enu", "Young's modulus and Poisson's ratio");
    model.component("comp1").material("mat1").propertyGroup().create("linzRes", "linzRes", "Linearized resistivity");
    model.component("comp1").material("mat1").label("Copper");
    model.component("comp1").material("mat1").set("family", "copper");
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("relpermeability", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("electricconductivity", new String[]{"5.998e7[S/m]", "0", "0", "0", "5.998e7[S/m]", "0", "0", "0", "5.998e7[S/m]"});
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("thermalexpansioncoefficient", new String[]{"17e-6[1/K]", "0", "0", "0", "17e-6[1/K]", "0", "0", "0", "17e-6[1/K]"});
    model.component("comp1").material("mat1").propertyGroup("def").set("heatcapacity", "385[J/(kg*K)]");
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("relpermittivity", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat1").propertyGroup("def").set("density", "8960[kg/m^3]");
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("thermalconductivity", new String[]{"400[W/(m*K)]", "0", "0", "0", "400[W/(m*K)]", "0", "0", "0", "400[W/(m*K)]"});
    model.component("comp1").material("mat1").propertyGroup("Enu").set("E", "110[GPa]");
    model.component("comp1").material("mat1").propertyGroup("Enu").set("nu", "0.35");
    model.component("comp1").material("mat1").propertyGroup("linzRes").set("rho0", "1.72e-8[ohm*m]");
    model.component("comp1").material("mat1").propertyGroup("linzRes").set("alpha", "0.0039[1/K]");
    model.component("comp1").material("mat1").propertyGroup("linzRes").set("Tref", "298[K]");
    model.component("comp1").material("mat1").propertyGroup("linzRes").addInput("temperature");

    model.component("comp1").physics().create("ec", "ConductiveMedia", "geom1");
    model.component("comp1").physics("ec").create("term1", "Terminal", 2);
    model.component("comp1").physics("ec").feature("term1").selection().set(1);
    model.component("comp1").physics("ec").feature("term1").set("I0", 2000);
    model.component("comp1").physics("ec").create("gnd1", "Ground", 2);
    model.component("comp1").physics("ec").feature("gnd1").selection().all();
    model.component("comp1").physics("ec").feature("gnd1").selection().set();
    model.component("comp1").physics("ec").feature().remove("gnd1");
    model.component("comp1").physics("ec").create("gnd1", "PairGround", 2);
    model.component("comp1").physics("ec").feature("gnd1").set("pairSelection", "all");
    model.component("comp1").physics("ec").feature().remove("gnd1");
    model.component("comp1").physics("ec").create("gnd1", "Ground", 1);
    model.component("comp1").physics("ec").feature("gnd1").selection().set();
    model.component("comp1").physics("ec").feature().remove("gnd1");
    model.component("comp1").physics("ec").create("gnd1", "PairGround", 2);
    model.component("comp1").physics("ec").feature().remove("gnd1");
    model.component("comp1").physics("ec").create("gnd1", "Ground", 2);
    model.component("comp1").physics("ec").feature("gnd1").selection().all();
    model.component("comp1").physics("ec").feature("gnd1").selection().set(90);

    model.component("comp1").mesh("mesh1").run();

    model.study().create("std1");
    model.study("std1").create("stat", "Stationary");
    model.study("std1").createAutoSequences("all");

    model.sol("sol1").runAll();

    model.result().create("pg1", "PlotGroup3D");
    model.result("pg1").label("Electric Potential (ec)");
    model.result("pg1").set("frametype", "spatial");
    model.result("pg1").set("showlegendsmaxmin", true);
    model.result("pg1").feature().create("vol1", "Volume");
    model.result("pg1").feature("vol1").set("solutionparams", "parent");
    model.result("pg1").feature("vol1").set("colortable", "Dipole");
    model.result("pg1").feature("vol1").set("evaluationsettings", "parent");
    model.result("pg1").feature("vol1").set("data", "parent");
    model.result().create("pg2", "PlotGroup3D");
    model.result("pg2").label("Electric Field (ec)");
    model.result("pg2").set("frametype", "spatial");
    model.result("pg2").set("showlegendsmaxmin", true);
    model.result("pg2").feature().create("mslc1", "Multislice");
    model.result("pg2").feature("mslc1").set("solutionparams", "parent");
    model.result("pg2").feature("mslc1").set("expr", "ec.normE");
    model.result("pg2").feature("mslc1").set("multiplanexmethod", "coord");
    model.result("pg2").feature("mslc1").set("xcoord", "ec.CPx");
    model.result("pg2").feature("mslc1").set("multiplaneymethod", "coord");
    model.result("pg2").feature("mslc1").set("ycoord", "ec.CPy");
    model.result("pg2").feature("mslc1").set("multiplanezmethod", "coord");
    model.result("pg2").feature("mslc1").set("zcoord", "ec.CPz");
    model.result("pg2").feature("mslc1").set("colortable", "Prism");
    model.result("pg2").feature("mslc1").set("colortabletrans", "nonlinear");
    model.result("pg2").feature("mslc1").set("colorcalibration", -0.8);
    model.result("pg2").feature("mslc1").set("evaluationsettings", "parent");
    model.result("pg2").feature("mslc1").set("data", "parent");
    model.result("pg2").feature().create("strmsl1", "StreamlineMultislice");
    model.result("pg2").feature("strmsl1").set("solutionparams", "parent");
    model.result("pg2").feature("strmsl1").set("expr", new String[]{"ec.Ex", "ec.Ey", "ec.Ez"});
    model.result("pg2").feature("strmsl1").set("multiplanexmethod", "coord");
    model.result("pg2").feature("strmsl1").set("xcoord", "ec.CPx");
    model.result("pg2").feature("strmsl1").set("multiplaneymethod", "coord");
    model.result("pg2").feature("strmsl1").set("ycoord", "ec.CPy");
    model.result("pg2").feature("strmsl1").set("multiplanezmethod", "coord");
    model.result("pg2").feature("strmsl1").set("zcoord", "ec.CPz");
    model.result("pg2").feature("strmsl1").set("titletype", "none");
    model.result("pg2").feature("strmsl1").set("posmethod", "uniform");
    model.result("pg2").feature("strmsl1").set("udensity", 8);
    model.result("pg2").feature("strmsl1").set("color", "black");
    model.result("pg2").feature("strmsl1").set("evaluationsettings", "parent");
    model.result("pg2").feature("strmsl1").set("maxlen", 0.4);
    model.result("pg2").feature("strmsl1").set("maxtime", Double.POSITIVE_INFINITY);
    model.result("pg2").feature("strmsl1").set("inheritcolor", false);
    model.result("pg2").feature("strmsl1").set("maxtime", Double.POSITIVE_INFINITY);
    model.result("pg2").feature("strmsl1").set("data", "parent");
    model.result("pg2").feature("strmsl1").set("inheritplot", "mslc1");
    model.result("pg2").feature("strmsl1").feature().create("tran1", "Transparency");
    model.result("pg2").feature("strmsl1").feature("tran1").set("transparency", 0.9);
    model.result("pg2").feature("strmsl1").feature().create("filt1", "Filter");
    model.result("pg2").feature("strmsl1").feature("filt1").set("expr", "!isScalingSystemDomain");
    model.result("pg1").run();
    model.result().create("pg3", "PlotGroup3D");
    model.result("pg3").run();
    model.result("pg3").create("surf1", "Surface");
    model.result("pg3").feature("surf1").set("evaluationsettings", "parent");
    model.result("pg3").feature("surf1").set("expr", "ec.normJ");
    model.result("pg3").run();
    model.result("pg3").run();
    model.result("pg3").create("mms1", "MaxMinSurface");
    model.result("pg3").feature("mms1").set("expr", "ec.normJ");
    model.result("pg3").run();

    model.component("comp1").physics().create("ht", "HeatTransfer", "geom1");

    model.component("comp1").multiphysics().create("emh1", "ElectromagneticHeating", 3);

    model.component("comp1").physics("ht").create("sar1", "SurfaceToAmbientRadiation", 2);
    model.component("comp1").physics("ht").feature("sar1").selection().all();
    model.component("comp1").physics("ht").feature("sar1").set("epsilon_rad_mat", "userdef");
    model.component("comp1").physics("ht").feature("sar1").set("epsilon_rad", 1);
    model.component("comp1").physics("ht").create("hf1", "HeatFluxBoundary", 2);
    model.component("comp1").physics("ht").feature("hf1").selection().all();
    model.component("comp1").physics("ht").feature("hf1").set("HeatFluxType", "ConvectiveHeatFlux");
    model.component("comp1").physics("ht").feature("hf1").set("h", 5);
    model.component("comp1").physics("ht").create("temp1", "TemperatureBoundary", 2);
    model.component("comp1").physics("ht").feature("temp1").selection().set(1, 90);

    model.study("std1").createAutoSequences("all");

    model.sol("sol1").runAll();

    model.result("pg1").run();
    model.result().create("pg4", "PlotGroup3D");
    model.result("pg4").run();
    model.result("pg4").create("surf1", "Surface");
    model.result("pg4").feature("surf1").set("evaluationsettings", "parent");
    model.result("pg4").feature("surf1").set("expr", "T");
    model.result("pg4").run();
    model.result("pg4").run();
    model.result("pg4").create("mms1", "MaxMinSurface");
    model.result("pg4").feature("mms1").set("expr", "T");
    model.result("pg4").run();

    model.component("comp1").physics("ec").feature("cucns1").set("ConstitutiveRelationJcE", "LinearizedResistivity");

    model.study("std1").createAutoSequences("all");

    model.sol("sol1").runAll();

    model.result("pg1").run();
    model.result("pg3").run();
    model.result("pg4").run();
    model.result("pg4").run();

    model.component("comp1").physics().create("solid", "SolidMechanics", "geom1");
    model.component("comp1").physics("solid").create("fix1", "Fixed", 2);
    model.component("comp1").physics("solid").feature("fix1").selection().set(1);
    model.component("comp1").physics("solid").create("bl1", "BodyLoad", 3);
    model.component("comp1").physics("solid").feature("bl1").selection().set(1);

    model.component("comp1").material("mat1").propertyGroup("Enu").set("E", new String[]{"110e9*(273.15/T)[K*Pa]"});

    model.study("std1").createAutoSequences("all");

    model.sol("sol1").runAll();

    model.result("pg1").run();
    model.result().create("pg5", "PlotGroup3D");
    model.result("pg5").run();
    model.result("pg5").create("surf1", "Surface");
    model.result("pg5").feature("surf1").set("evaluationsettings", "parent");
    model.result("pg5").feature("surf1").set("expr", "solid.mises");
    model.result("pg5").run();

    model.label("LASTONE.mph");

    model.result("pg5").run();

    model.mesh().clearMeshes();

    model.sol("sol1").clearSolutionData();

    return model;
  }

  public static void main(String[] args) {
    run();
  }

}
