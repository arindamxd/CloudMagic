package com.few.cloudmagic.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.few.cloudmagic.activities.MailItemDetailActivity;
import com.few.cloudmagic.activities.MailItemListActivity;
import com.few.cloudmagic.R;

/**
 * A fragment representing a single MailItem detail screen.
 * This fragment is either contained in a {@link MailItemListActivity}
 * in two-pane mode (on tablets) or a {@link MailItemDetailActivity}
 * on handsets.
 */
public class MailItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MailItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mailitem_detail, container, false);
        // Show the dummy content as text in a TextView.

        return rootView;
    }
}
