package com.example.bmi


import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment

class FirstFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById(R.id.button_first).setOnClickListener(object : OnClickListener() {
            fun onClick(view: View?) {
                NavHostFragment.findNavController(this@FirstFragment)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment)
            }
        })
    }
}