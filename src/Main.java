import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Игрок
        Player p1 = new Player(11.0,15.0,"","Light propagation",25, 10);
        // враги мир1
        Mob Shadowling = new Mob(20.0, 5.0, "Shadowling", "Warmth... light... give it to me...");
        Mob RavagedSpirit = new Mob(25.0, 6.0,"Ravaged Spirit", "We are darkness. You are a mistake.");
        Mob DarkenedWolf = new Mob(30.0, 7.0, "Darkened Wolf", "You smell like light. You make me sick...");
        Mob TwistedHusk = new Mob(28.0, 8.0, "Twisted Husk", "We are the remnants. We are what will become of you.");
        Miniboss SentinelofShadows = new Miniboss(80.0,15.0,"Sentinel of Shadows", "Back. The light won't pass. The light must die.");
        Boss TheDarkRitualist = new Boss(130.0, 20.0,"The Dark Ritualist", "Fool... Light won't save you. We created the Lord of Darkness ourselves... and we're proud of it.");

        // враги мир 2
        Mob RotwoodGhoul = new Mob(40.0, 10.0, "Rotwood Ghoul", "The forest remembers you... as prey.");
        Mob VileCreeper = new Mob(35.0, 9.0, "Vile Creeper", "The light will go out, just as everything else here has gone out.");
        Mob SwampMaw = new Mob(45.0, 11.0, "Swamp Maw", "Absorb... dissolve... become one...");
        Mob DecayStalker = new Mob(42.0, 12.0, "Decay Stalker", "You are preventing this world from dying.");
        Miniboss HeartofRot = new Miniboss(120.0, 20.0, "Heart of Rot", "Hit me... and the forest will die faster.");
        Boss MotherofDecay = new Boss(200.0, 30.0, "Mother of Decay", "I am a mother. And you are a weak child of light...");

        // мир 3
        Mob AshbornWanderer = new Mob(55.0, 14.0, "Ashborn Wanderer",
                "Do you feel the heat? It's the last thing you'll ever feel...");
        Mob EmberGhast = new Mob(60.0, 15.0, "Ember Ghast",
                "Burn... burn with me... let the light melt...");
        Mob CharredSentinel = new Mob(65.0, 16.0, "Charred Sentinel",
                "You walk where only ashes belong.");
        Mob CoalRevenant = new Mob(58.0, 17.0, "Coal Revenant",
                "Your light… it will smolder soon.");
        Miniboss FlameboundTitan = new Miniboss(160.0, 28.0, "Flamebound Titan",
                "I stood here before the fall, and I will stand long after your light fades.");
        Boss LordofAsh = new Boss(260.0, 40.0, "Lord of Ash",
                "A spark of light dares to enter my domain... How amusing.");

        // мир 4
        Mob AbyssCrawler = new Mob(75.0, 18.0, "Abyss Crawler",
                "Down... deeper... your light belongs to the abyss...");
        Mob HollowDrifter = new Mob(80.0, 19.0, "Hollow Drifter",
                "I remember having a shape... before the darkness ate it.");
        Mob EchoWraith = new Mob(85.0, 20.0, "Echo Wraith",
                "You hear that echo? That's your future… disappearing.");
        Mob RiftGhoul = new Mob(78.0, 21.0, "Rift Ghoul",
                "The abyss opens... and you shall fall.");
        Miniboss AbyssalBehemoth = new Miniboss(200.0, 32.0, "Abyssal Behemoth",
                "You shine bright... it disgusts me.");
        Boss TheAbyssQueen = new Boss(330.0, 45.0, "The Abyss Queen",
                "So you are the one who carries the last light?\nCome closer... let me extinguish it.");
        Boss LordofDarkness = new Boss(450.0, 50.0, "Lord of Darkness", "So you've finally come, bearer of light... Do you think you can stop me? \n" +
                "All your hopes are doomed, and your light will be consumed forever!");



        //NPC
        NPC eldrin = new NPC("Eldrin the Lightbringer", "Hello, traveler...\n" + "Do you still have light inside you? I haven't seen that in many years.\n"
                + "You: I don't know what's going on, but I want to understand.\n" + "Eldrin: Then proceed. Darkness will test you.");
        NPC BlindDryad = new NPC("Blind Dryad", "Your light... it hurts my ears... but I feel that it is still warm.\n" + "You: Where to go next?\n" + "Blind Dryad: Go deeper. That's where the source of decay is.");
        NPC AshPriest = new NPC("Ash Priest", "Lightbearer... the flames whisper your name.\n"
                        + "You: What happened here?\n"
                        + "Ash Priest: Fire cleansed the world, but darkness fed the flames.");
        NPC WhisperingShade = new NPC("Whispering Shade","You carry light... but down here, light becomes a curse.\n"
                        + "You: Then why am I still alive?\n"
                        + "Shade: Because the abyss is curious...");



        //Локации
        Location startLocation = new Location("Foothills", Shadowling, RavagedSpirit ,null,null, eldrin);
        Location location2World1 = new Location("Cracked Pass", DarkenedWolf, TwistedHusk, SentinelofShadows, TheDarkRitualist, null);
        ArrayList<Location> world1Locations = new ArrayList<>();
        world1Locations.add(startLocation);
        world1Locations.add(location2World1);

        Location startLocationWorld2 = new Location("Sunless Grove", RotwoodGhoul, VileCreeper, null, null, BlindDryad);
        Location location2World2 = new Location("Rotting Mire", SwampMaw, DecayStalker, HeartofRot, MotherofDecay, null);
        ArrayList<Location> world2Locations = new ArrayList<>();
        world2Locations.add(startLocationWorld2);
        world2Locations.add(location2World2);

        Location startLocationWorld3 = new Location("Burned Plains",
                AshbornWanderer, EmberGhast, null, null, AshPriest);

        Location location2World3 = new Location("Cinder Vault",
                CharredSentinel, CoalRevenant, FlameboundTitan, LordofAsh, null);

        ArrayList<Location> world3Locations = new ArrayList<>();
        world3Locations.add(startLocationWorld3);
        world3Locations.add(location2World3);

        Location startLocationWorld4 = new Location("Shattered Depths",
                AbyssCrawler, HollowDrifter, null, null, WhisperingShade);

        Location location2World4 = new Location("The Black Rift",
                EchoWraith, RiftGhoul, AbyssalBehemoth, TheAbyssQueen, null);

        Location finalLocationWorld5 = new Location("Dark Core / Throne Hall", null, null, null, LordofDarkness, null);

        ArrayList<Location> world4Locations = new ArrayList<>();
        world4Locations.add(startLocationWorld4);
        world4Locations.add(location2World4);

        ArrayList<Location> world5Locations = new ArrayList<>();
        world5Locations.add(finalLocationWorld5);


        //Миры
        World world1 = new World("Foothills of Darkness", world1Locations, "“The foothills of darkness are the first lands where the light has already begun to fade.”\n" +
                "\n" +
                "You stand on a slope where soft light still breaks through the dark clouds. Harmony once reigned here, but now the world is permeated with the whispers of darkness. The wind carries strange sounds — as if the earth itself is crying. In these places, you will encounter the first manifestations of dark forces, but you can still rely on the spark of light within yourself.");
        World world2 = new World("Rotting Forest", world2Locations, "“The rotting forest is the heart of decay and decay.”\n" +
                "\n" +
                "The trees here are crooked and black, their bark cracking as if life itself is leaving the forest. There is a putrid smell in the air, and underfoot is soft, almost living mold. The sounds of rustling and indistinct moans make your heart beat faster. In this forest, darkness has grown stronger, and every creature here craves light to devour it.");
        World world3 = new World("Ashen Wasteland", world3Locations, "World 3: Ashen Wasteland\n" +
                "\n" +
                "“The Ashen Wasteland is a world of fire and destruction.”\n" +
                "\n" +
                "The earth is black and scorched, ash falls from the sky, settling on the charred remains of trees and stones. In the distance, you can hear crackling and rumbling, as if the earth itself is burning. Here, darkness envelops the light even more tightly — fire purifies, but at the same time consumes all living things. In this world, the trials will be tougher, and the enemies stronger and more cunning.");
        World world4 = new World("Abyssal Depths", world4Locations, "World 4: Abyssal Depths\n" +
                "\n" +
                "“The bottomless depths—the last refuge of darkness.”\n" +
                "\n" +
                "You enter vast underground catacombs where light barely penetrates. Darkness presses in from all sides, and the echo of your footsteps seems alive. The most terrifying creatures dwell here, and the darkness itself seems to watch you. The final world will test whether the light remains within you and whether you can stand against the lord of darkness.");
        World world5 = new World("Realm of Darkness / Dark Citadel", world5Locations, "You enter the Dark Citadel. With each step you take, the light around you fades further. \n" +
                "The cold penetrates your bones, and the echo of your footsteps sounds like a death rattle. \n" +
                "\n" +
                "In the center of the hall, a being sits on a throne, its darkness consuming everything around it. \n" +
                "Its eyes flash with red flames when it notices you.");
        ArrayList<World> worlds = new ArrayList<>();
        worlds.add(world1);
        worlds.add(world2);
        worlds.add(world3);
        worlds.add(world4);
        worlds.add(world5);

        //Запуск игры
        Menu game1 = new Menu();
        game1.startGame(p1, game1, worlds);
    }
}