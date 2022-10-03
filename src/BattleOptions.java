
public class BattleOptions {
    private int[] splits;
    private boolean printSRsOnLvl = false;
    private boolean printSRsBoostOnLvl = false;
    private StatModifier mod1;
    private StatModifier mod2;
    private int verbose;
    //verbose options
    public static final int NONE = 0;
    public static final int SOME = 1;
    public static final int ALL = 2;
    public static final int EVERYTHING = 3;
    
    public BattleOptions() {
        setMod1(new StatModifier());
        setMod2(new StatModifier());
        splits = new int[] { 1, 1, 1, 1, 1, 1 };
        setVerbose(Settings.defaultVerbose);
    }

    public boolean isPrintSRsBoostOnLvl() {
        return printSRsBoostOnLvl;
    }

    public void setPrintSRsBoostOnLvl(boolean printSRsBoostOnLvl) {
        this.printSRsBoostOnLvl = printSRsBoostOnLvl;
    }

    public void setParticipants(int participants) {
        for(int i=0;i<6;i++) {
            splits[i] = participants;
        }
    }
    
    public void setSplits(int[] splits) {
        for(int i=0;i<6 && i<splits.length;i++) {
            this.splits[i] = splits[i];
        }
    }
    
    public int getParticipants(int pkmnIndex) {
        return splits[pkmnIndex];
    }

    public boolean isPrintSRsOnLvl() {
        return printSRsOnLvl;
    }

    public void setPrintSRsOnLvl(boolean printSRsOnLvl) {
        this.printSRsOnLvl = printSRsOnLvl;
    }

    public StatModifier getMod1() {
        return mod1;
    }

    public void setMod1(StatModifier mod1) {
        this.mod1 = mod1;
    }

    public StatModifier getMod2() {
        return mod2;
    }

    public void setMod2(StatModifier mod2) {
        this.mod2 = mod2;
    }

    public int getVerbose() {
        return verbose;
    }

    public void setVerbose(int verbose) {
        this.verbose = verbose;
    }

    public void setVerbose(String verbose) {
        if(verbose.matches("[0-9]+")) {
            setVerbose(Integer.parseInt(verbose));
        } else if(verbose.equalsIgnoreCase("NONE")) {
            setVerbose(BattleOptions.NONE);
        } else if(verbose.equalsIgnoreCase("SOME")) {
            setVerbose(BattleOptions.SOME);
        } else if(verbose.equalsIgnoreCase("ALL")) {
            setVerbose(BattleOptions.ALL);
        } else if(verbose.equalsIgnoreCase("EVERYTHING")) {
            setVerbose(BattleOptions.EVERYTHING);
        }
    }
    
}
