package com.bignerdranch.android.criminalintent

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.criminalintent.databinding.ListItemSeriouscrimeBinding

class SeriousCrimeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val crimeTitleTextView: TextView = itemView.findViewById(R.id.crime_title)
    private val crimeDateTextView: TextView = itemView.findViewById(R.id.crime_date)
    private val contactPoliceButton: Button = itemView.findViewById(R.id.contact_police_button)

    fun bind(crime: Crime) {
        crimeTitleTextView.text = crime.title
        crimeDateTextView.text = crime.date.toString()
        contactPoliceButton.setOnClickListener {
            Toast.makeText(itemView.context, "Contact Police clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}