/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the names of copyright holders nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25;

/**
* @author Steve Jin (http://www.doublecloud.org)
* @version 5.1
*/

@SuppressWarnings("all")
public class OvfFileItem extends DynamicData {
  public String deviceId;
  public String path;
  public String compressionMethod;
  public Long chunkSize;
  public Long size;
  public int cimType;
  public boolean create;

  public String getDeviceId() {
    return this.deviceId;
  }

  public String getPath() {
    return this.path;
  }

  public String getCompressionMethod() {
    return this.compressionMethod;
  }

  public Long getChunkSize() {
    return this.chunkSize;
  }

  public Long getSize() {
    return this.size;
  }

  public int getCimType() {
    return this.cimType;
  }

  public boolean isCreate() {
    return this.create;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId=deviceId;
  }

  public void setPath(String path) {
    this.path=path;
  }

  public void setCompressionMethod(String compressionMethod) {
    this.compressionMethod=compressionMethod;
  }

  public void setChunkSize(Long chunkSize) {
    this.chunkSize=chunkSize;
  }

  public void setSize(Long size) {
    this.size=size;
  }

  public void setCimType(int cimType) {
    this.cimType=cimType;
  }

  public void setCreate(boolean create) {
    this.create=create;
  }
}