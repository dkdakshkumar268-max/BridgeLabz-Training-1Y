package com.gla.streamapi;

@FunctionalInterface
interface LightBehavior {
    void activate();
}
public class SmartHomeLightingAutomation {
    public static void main(String[] args) {
        LightBehavior motionLight = ()->System.out.println("Lights ON at full brightness due to motion");
        LightBehavior nightLight = ()->System.out.println("Lights ON at dim brightness (night mode)");
        LightBehavior voiceLight = ()->System.out.println("Lights set to custom color via voice command");
        LightBehavior eveningLight = ()->System.out.println("Lights turned warm white for evening");
        triggerLight(motionLight);
        triggerLight(nightLight);
        triggerLight(voiceLight);
        triggerLight(eveningLight);
    }
    public static void triggerLight(LightBehavior behavior) {
        behavior.activate();
    }
}
