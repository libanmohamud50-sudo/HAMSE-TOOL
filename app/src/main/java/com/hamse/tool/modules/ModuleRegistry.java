package com.hamse.tool.modules;
import java.util.*;
public final class ModuleRegistry {
    public static class Module { public final String name; public Module(String n) { name = n; } }
    public static List<Module> all() { List<Module> l = new ArrayList<>(); l.add(new Module("PAK Tool")); return l; }
}
