package com.example.daggerfruitshop;

import com.example.daggerfruitshop.ui.MainActivity;

import dagger.Module;

/**
 * A module is where you declare that a class has injected dependencies
 * entryPoint - is what class will need the dependencies inject
 * 
 * @author Blundell
 * 
 */
@Module(entryPoints = {MainActivity.class})
public class MainActivityModule {

}
