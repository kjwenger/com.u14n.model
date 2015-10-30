/**
 * 
 */
package com.u14n.model.state;

/**
 * @author Klaus Wenger
 */
public class StateModel {
    /**
     * 
     */
    public StateModel() {
        super();
    }
    /**
     * @return All available {@link State} entries.
     */
    public State[] getAllStates() {
        State[] states = new State[StateModel.STATE_TEXTS.length];
        for (int i = 0; i < StateModel.STATE_TEXTS.length; i++) {
            states[i] = new StateGlyph((byte) i);
        }
        return states;
    }
    /**
     * @param state
     * @return
     */
    public boolean isState(String state) {
        for (int i = 0; i < StateModel.STATE_TEXTS.length; i++) {
            return StateModel.STATE_TEXTS[i][1].equals(state);
        }
        return false;
    }

    /**
     * @return A single instance of this model.
     */
    public static synchronized StateModel getInstance() {
        if (StateModel.instance == null) {
            StateModel.instance = new StateModel();
        }
        return StateModel.instance;
    }

    private static StateModel instance;

    /**
     * @author Klaus Wenger
     */
    private static final class StateGlyph implements State {
        /**
         * @param index
         */
        /* package */ StateGlyph(byte index) {
            this.index = index;
        }
        /* (non-Javadoc)
         * @see com.u14n.model.state.State#getDisplayState()
         */
        public String getDisplayState() {
            return StateModel.STATE_TEXTS[this.index][0];
        }
        /* (non-Javadoc)
         * @see com.u14n.model.state.State#getState()
         */
        public String getState() {
            return StateModel.STATE_TEXTS[this.index][1];
        }
        @Override
        public String toString() {
            return StateModel.STATE_TEXTS[this.index][0];
        }

        private final byte index;
    }

    private static final String[][] STATE_TEXTS = new String[][] {
        { "Alabama", "AL" },
        { "Alaska", "AK" },
        { "Arizona", "AZ" },
        { "Arkansas", "AR" },
        { "California", "CA" },
        { "Colorado", "CO" },
        { "Connecticut", "CT" },
        { "Delaware", "DE" },
        { "District of Columbia", "DC" },
        { "Florida", "FL" },
        { "Georgia", "GA" },
        { "Hawaii", "HI" },
        { "Idaho", "ID" },
        { "Illinois", "IL" },
        { "Indiana", "IN" },
        { "Iowa", "IA" },
        { "Kansas", "KS" },
        { "Kentucky", "KY" },
        { "Louisiana", "LA" },
        { "Maine", "ME" },
        { "Maryland", "MD" },
        { "Massachusetts", "MA" },
        { "Michigan", "MI" },
        { "Minnesota", "MN" },
        { "Mississippi", "MS" },
        { "Missouri", "MO" },
        { "Montana", "MT" },
        { "Nebraska", "NE" },
        { "Nevada", "NV" },
        { "New Hampshire", "NH" },
        { "New Jersey", "NJ" },
        { "New Mexico", "NM" },
        { "New York", "NY" },
        { "North Carolina", "NC" },
        { "North Dakota", "ND" },
        { "Ohio", "OH" },
        { "Oklahoma", "OK" },
        { "Oregon", "OR" },
        { "Pennsylvania", "PA" },
        { "Rhode Island", "RI" },
        { "South Carolina", "SC" },
        { "South Dakota", "SD" },
        { "Tennessee", "TN" },
        { "Texas", "TX" },
        { "Utah", "UT" },
        { "Vermont", "VT" },
        { "Virginia", "VA" },
        { "Washington", "WA" },
        { "West Virginia", "WV" },
        { "Wisconsin", "WI" },
        { "Wyoming", "WY" },
    };
//    private static final State[] STATES =
//        new State[StateModel.STATE_TEXTS.length];
//    static {
//        for (int i = 0; i < StateModel.STATE_TEXTS.length; i++) {
//            StateModel.STATES[i] = new StateGlyph((byte) i);
//        }
//    }
}
