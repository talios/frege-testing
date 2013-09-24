package com.talios.frege;

import frege.prelude.PreludeBase;
import frege.rt.Box;
import org.testng.annotations.Test;

import static com.talios.frege.Greet.*;
import static org.fest.assertions.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void testDataType() {

        TGreeting newGreeting  = TGreeting.mk(Box.mk("Mark"), TSalutation.mk(Box.mk("Hello there"), Box.mk("Chow!")));

        System.out.println(MyFrege.testGreeting._e().toString());

        assertThat(TGreeting.name(newGreeting)).isEqualTo("Mark");
        assertThat(TSalutation.welcome(TGreeting.salutation(newGreeting))).isEqualTo("Hello there");

        String greet = MyFrege.makeGreeting(newGreeting);
        String farewell = MyFrege.makeFarewell(newGreeting);

        System.out.println(farewell);

        PreludeBase.TST.performUnsafe(MyFrege.greet(newGreeting))._e();

        assertThat(greet).isEqualTo("Hello there Mark, how are you?");

        // create a java class and pass that to our frege function
        MyJavaClass mjc = com.talios.frege.Testing.makeHim("Made in Java, via Frege");
        System.out.println("His name is: " + mjc.getName());

        com.talios.frege.Testing.main(new String[] {""});
        com.talios.frege.MyFrege.main(new String[] {""});
    }

}
