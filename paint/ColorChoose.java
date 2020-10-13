/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

package paint;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
//Class extends JFrame and implements intefrace ChangeListener
public class ColorChoose extends JFrame implements ChangeListener {
	//declare object of color chooser class for dialog box
    public static JColorChooser tcc;
    public ColorChoose() {
    	setTitle("Choose Color");
    	setVisible(true);
    	setSize(600, 400);
        //method is used to specify one of several options for the close button
        //Dispose of the frame object, but keep the application running.
    	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	//JPanel provides space in which an application can attach any other component.
        JPanel bannerPanel = new JPanel(new BorderLayout());

        tcc = new JColorChooser();
        //Gets the value of the property selectionModel.
        //Adds a ChangeListener to the slider.
        tcc.getSelectionModel().addChangeListener(this);

        this.add(bannerPanel, BorderLayout.CENTER);
        this.add(tcc, BorderLayout.NORTH);
        //JButton is used to create a labeled button that has platform independent implementation
        JButton btn = new JButton("OK");
        //
        btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
        bannerPanel.add(btn, BorderLayout.SOUTH);
    }

    public void stateChanged(ChangeEvent e) {
        GUI.selectColor = tcc.getColor();
    }
}